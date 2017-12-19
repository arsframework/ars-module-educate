package ars.module.educate.service;

import ars.module.educate.model.Student;
import ars.module.educate.service.StudentService;
import ars.module.people.service.AbstractUserService;

/**
 * 学生业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractStudentService<T extends Student> extends AbstractUserService<T>
		implements StudentService<T> {

}
