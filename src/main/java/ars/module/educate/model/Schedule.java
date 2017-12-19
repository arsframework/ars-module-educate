package ars.module.educate.model;

import ars.database.model.AbstractModel;

/**
 * 课表数据模型
 * 
 * @author yongqiangwu
 * 
 */
public class Schedule extends AbstractModel {
	private static final long serialVersionUID = 1L;

	private Course course; // 课程
	private Classes classes; // 班级
	private Teacher teacher; // 教员

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
