package ars.module.educate.repository;

import ars.module.educate.model.Classes;
import ars.database.repository.Repository;

/**
 * 教学班级数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface ClassesRepository<T extends Classes> extends Repository<T> {

}
