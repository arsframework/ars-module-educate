package ars.module.educate.service;

import ars.module.educate.model.CourseType;
import ars.module.educate.service.CourseTypeService;
import ars.database.service.StandardGeneralService;

/**
 * 课程类型业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractCourseTypeService<T extends CourseType> extends StandardGeneralService<T>
		implements CourseTypeService<T> {

}
