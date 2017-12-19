package ars.module.educate.repository;

import ars.database.repository.Repository;
import ars.module.educate.model.Profession;

/**
 * 专业数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface ProfessionRepository<T extends Profession> extends Repository<T> {

}
