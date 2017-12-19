package ars.module.educate.service;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashMap;

import ars.util.SimpleTree;
import ars.invoke.request.Requester;
import ars.invoke.request.ParameterInvalidException;
import ars.module.people.model.Group;
import ars.module.educate.model.Classes;
import ars.module.educate.model.Profession;
import ars.module.educate.service.ClassesService;
import ars.database.repository.Repositories;
import ars.database.service.StandardGeneralService;

/**
 * 教学班级业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractClassesService<T extends Classes> extends StandardGeneralService<T>
		implements ClassesService<T> {

	@Override
	public void initObject(Requester requester, T entity, Map<String, Object> parameters) {
		super.initObject(requester, entity, parameters);
		boolean exists = this.getRepository().query().eq("profession", entity.getProfession())
				.eq("name", entity.getName()).ne("id", entity.getId()).count() > 0;
		if (exists) {
			throw new ParameterInvalidException("name", "exist");
		}
	}

	@Override
	public List<SimpleTree> trees(Requester requester, Integer level, Map<String, Object> parameters) {
		List<T> objects = this.getQuery(requester, parameters).list();
		if (objects.isEmpty()) {
			return new ArrayList<SimpleTree>(0);
		}
		List<Group> departments = new LinkedList<Group>();
		Map<Group, List<SimpleTree>> leaves = new LinkedHashMap<Group, List<SimpleTree>>();
		Map<Integer, SimpleTree> professions = new LinkedHashMap<Integer, SimpleTree>();
		for (int i = 0; i < objects.size(); i++) {
			T classes = objects.get(i);
			Profession profession = classes.getProfession();
			Group department = profession.getDepartment();
			SimpleTree parent = professions.get(profession.getId());
			if (parent == null) {
				parent = Repositories.getSimpleTree(profession);
				professions.put(profession.getId(), parent);
				List<SimpleTree> classeses = leaves.get(department);
				if (classeses == null) {
					classeses = new LinkedList<SimpleTree>();
					leaves.put(department, classeses);
				}
				classeses.add(parent);
			}
			parent.getChildren().add(Repositories.getSimpleTree(classes));
			while (department != null && (level == null || department.getLevel() >= level)
					&& !departments.contains(department)) {
				departments.add(department);
				department = department.getParent();
			}
		}
		Map<Group, SimpleTree> mappings = new HashMap<Group, SimpleTree>(departments.size());
		List<SimpleTree> trunks = Repositories.getSimpleTrees(Repositories.mergeTrees(departments), mappings);
		for (Entry<Group, List<SimpleTree>> entry : leaves.entrySet()) {
			SimpleTree leaf = mappings.get(entry.getKey());
			List<SimpleTree> children = entry.getValue();
			leaf.getChildren().addAll(0, children);
			for (SimpleTree child : children) {
				child.setParent(leaf);
			}
		}
		return trunks;
	}

}
