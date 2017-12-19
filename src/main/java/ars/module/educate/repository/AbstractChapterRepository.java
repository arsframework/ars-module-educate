package ars.module.educate.repository;

import ars.module.educate.model.Chapter;
import ars.module.educate.repository.ChapterRepository;
import ars.database.hibernate.HibernateSimpleRepository;

/**
 * 课程章节数据持久化操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractChapterRepository<T extends Chapter> extends HibernateSimpleRepository<T>
		implements ChapterRepository<T> {

}
