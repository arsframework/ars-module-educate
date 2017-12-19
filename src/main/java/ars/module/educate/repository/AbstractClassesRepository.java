package ars.module.educate.repository;

import ars.module.educate.model.Classes;
import ars.module.educate.repository.ClassesRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 教学班级数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractClassesRepository<T extends Classes> extends HibernateSimpleRepository<T>
		implements ClassesRepository<T> {

}
