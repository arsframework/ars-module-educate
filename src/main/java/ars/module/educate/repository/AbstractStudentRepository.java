package ars.module.educate.repository;

import ars.module.educate.model.Student;
import ars.module.educate.repository.StudentRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 学生数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractStudentRepository<T extends Student> extends HibernateSimpleRepository<T>
		implements StudentRepository<T> {

}
