package ars.module.educate.repository;

import ars.module.educate.model.CourseType;
import ars.module.educate.repository.CourseTypeRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 课程类型数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractCourseTypeRepository<T extends CourseType> extends HibernateSimpleRepository<T>
		implements CourseTypeRepository<T> {

}
