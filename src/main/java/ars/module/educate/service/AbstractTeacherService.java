package ars.module.educate.service;

import ars.module.educate.model.Teacher;
import ars.module.educate.service.TeacherService;
import ars.module.people.service.AbstractUserService;

/**
 * 教师业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractTeacherService<T extends Teacher> extends AbstractUserService<T>
		implements TeacherService<T> {

}
