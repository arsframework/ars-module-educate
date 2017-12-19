package ars.module.educate.repository;

import ars.module.educate.model.Schedule;
import ars.database.repository.Repository;

/**
 * 课表数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface ScheduleRepository<T extends Schedule> extends Repository<T> {

}
