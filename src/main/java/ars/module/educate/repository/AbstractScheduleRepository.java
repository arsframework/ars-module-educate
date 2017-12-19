package ars.module.educate.repository;

import ars.module.educate.model.Schedule;
import ars.module.educate.repository.ScheduleRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 课表数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractScheduleRepository<T extends Schedule> extends HibernateSimpleRepository<T>
		implements ScheduleRepository<T> {

}
