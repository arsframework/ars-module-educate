package ars.module.educate.repository;

import ars.module.educate.model.Teacher;
import ars.module.educate.repository.TeacherRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 老师数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractTeacherRepository<T extends Teacher> extends HibernateSimpleRepository<T>
		implements TeacherRepository<T> {

}
