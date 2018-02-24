package ars.module.educate.service;

import ars.invoke.local.Api;
import ars.module.educate.model.Student;
import ars.module.people.service.UserService;

/**
 * 学生业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/student")
public interface StudentService<T extends Student> extends UserService<T> {

}
