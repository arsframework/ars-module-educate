package ars.module.educate.repository;

import ars.module.educate.model.Teacher;
import ars.database.repository.Repository;

/**
 * 教师数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface TeacherRepository<T extends Teacher> extends Repository<T> {

}
