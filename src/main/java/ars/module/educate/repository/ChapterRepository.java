package ars.module.educate.repository;

import ars.module.educate.model.Chapter;
import ars.database.repository.Repository;

/**
 * 课程章节数据持久化操作接口
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public interface ChapterRepository<T extends Chapter> extends Repository<T> {

}
