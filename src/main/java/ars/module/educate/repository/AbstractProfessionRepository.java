package ars.module.educate.repository;

import ars.module.educate.model.Profession;
import ars.module.educate.repository.ProfessionRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 专业数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractProfessionRepository<T extends Profession> extends HibernateSimpleRepository<T>
		implements ProfessionRepository<T> {

}
