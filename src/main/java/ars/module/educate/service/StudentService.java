package ars.module.educate.service;

import ars.invoke.local.Api;
import ars.database.service.ExportService;
import ars.database.service.ImportService;
import ars.module.educate.model.Student;
import ars.module.people.service.UserService;

/**
 * 学生业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/student")
public interface StudentService<T extends Student> extends UserService<T>, ImportService<T>, ExportService<T> {

}
