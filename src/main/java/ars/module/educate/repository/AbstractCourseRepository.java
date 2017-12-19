package ars.module.educate.repository;

import ars.module.educate.model.Course;
import ars.module.educate.repository.CourseRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 课程数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractCourseRepository<T extends Course> extends HibernateSimpleRepository<T>
		implements CourseRepository<T> {

}
