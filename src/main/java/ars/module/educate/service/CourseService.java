package ars.module.educate.service;

import ars.invoke.local.Api;
import ars.module.educate.model.Course;
import ars.database.service.BasicService;

/**
 * 课程业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/course")
public interface CourseService<T extends Course> extends BasicService<T> {

}
