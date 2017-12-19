package ars.module.educate.service;

import ars.module.educate.model.Course;
import ars.module.educate.service.CourseService;
import ars.database.service.StandardGeneralService;

/**
 * 课程业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractCourseService<T extends Course> extends StandardGeneralService<T>
		implements CourseService<T> {

}
