package ars.module.educate.repository;

import ars.database.repository.Repository;
import ars.module.educate.model.CourseType;

/**
 * 课程类型数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface CourseTypeRepository<T extends CourseType> extends Repository<T> {

}
