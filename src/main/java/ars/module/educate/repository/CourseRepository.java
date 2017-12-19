package ars.module.educate.repository;

import ars.module.educate.model.Course;
import ars.database.repository.Repository;

/**
 * 课程数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface CourseRepository<T extends Course> extends Repository<T> {

}
