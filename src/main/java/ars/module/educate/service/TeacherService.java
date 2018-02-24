package ars.module.educate.service;

import ars.invoke.local.Api;
import ars.module.educate.model.Teacher;
import ars.module.people.service.UserService;

/**
 * 教师业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/teacher")
public interface TeacherService<T extends Teacher> extends UserService<T> {

}
