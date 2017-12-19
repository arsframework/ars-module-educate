package ars.module.educate.repository;

import ars.module.educate.model.Student;
import ars.database.repository.Repository;

/**
 * 学生数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface StudentRepository<T extends Student> extends Repository<T> {

}
