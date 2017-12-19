package ars.module.educate.service;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

import ars.util.SimpleTree;
import ars.invoke.request.Requester;
import ars.invoke.request.ParameterInvalidException;
import ars.module.educate.model.Course;
import ars.module.educate.model.Chapter;
import ars.module.educate.service.ChapterService;
import ars.database.repository.Query;
import ars.database.repository.Repositories;
import ars.database.service.StandardGeneralService;

/**
 * 课程章节抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractChapterService<T extends Chapter> extends StandardGeneralService<T>
		implements ChapterService<T> {

	@Override
	public void initObject(Requester requester, T entity, Map<String, Object> parameters) {
		super.initObject(requester, entity, parameters);
		Course course = entity.getCourse();
		Chapter parent = entity.getParent();
		Query<T> query = this.getRepository().query().ne("id", entity.getId()).eq("course", course).eq("name",
				entity.getName());
		if (parent == null) {
			query.empty("parent");
		} else {
			query.eq("parent", parent);
		}
		if (query.count() > 0) {
			throw new ParameterInvalidException("name", "exist");
		}
		if (parent == null) {
			if (course == null) {
				throw new ParameterInvalidException("course", "required");
			}
		} else if (course == null) {
			entity.setCourse(parent.getCourse());
		} else if (!course.equals(parent.getCourse())) {
			throw new ParameterInvalidException("course", "invalid");
		}
	}

	@Override
	public List<SimpleTree> ctrees(Requester requester, Map<String, Object> parameters) {
		List<T> trees = this.trees(requester, parameters);
		List<SimpleTree> branchs = Repositories.getSimpleTrees(trees);
		List<SimpleTree> roots = new ArrayList<SimpleTree>(trees.size());
		Map<Course, SimpleTree> temp = new HashMap<Course, SimpleTree>(trees.size());
		for (int i = 0; i < trees.size(); i++) {
			Course course = trees.get(i).getCourse();
			SimpleTree root = temp.get(course);
			if (root == null) {
				root = Repositories.getSimpleTree(course);
				temp.put(course, root);
				roots.add(root);
			}
			SimpleTree branch = branchs.get(i);
			branch.setParent(root);
			root.getChildren().add(branch);
		}
		return roots;
	}

}
