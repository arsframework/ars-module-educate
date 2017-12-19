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
import ars.module.people.model.Group;
import ars.module.educate.model.Profession;
import ars.module.educate.service.ProfessionService;
import ars.database.repository.Repositories;
import ars.database.service.StandardGeneralService;

/**
 * 专业业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractProfessionService<T extends Profession> extends StandardGeneralService<T>
		implements ProfessionService<T> {

	@Override
	public List<SimpleTree> trees(Requester requester, Integer level, Map<String, Object> parameters) {
		List<T> objects = this.getQuery(requester, parameters).list();
		if (objects.isEmpty()) {
			return new ArrayList<SimpleTree>(0);
		}
		List<Group> departments = new LinkedList<Group>();
		Map<Group, List<SimpleTree>> leaves = new LinkedHashMap<Group, List<SimpleTree>>();
		for (int i = 0; i < objects.size(); i++) {
			T profession = objects.get(i);
			Group department = profession.getDepartment();
			List<SimpleTree> professions = leaves.get(department);
			if (professions == null) {
				professions = new LinkedList<SimpleTree>();
				leaves.put(department, professions);
			}
			professions.add(Repositories.getSimpleTree(profession));
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
