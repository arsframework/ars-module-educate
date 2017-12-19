package ars.module.educate.service;

import ars.invoke.local.Api;
import ars.database.service.BasicService;
import ars.module.educate.model.CourseType;

/**
 * 课程类型业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/course/type")
public interface CourseTypeService<T extends CourseType> extends BasicService<T> {

}
