package ars.module.educate.model;

import ars.module.people.model.User;

import java.util.Date;

/**
 * 教师数据模型
 * 
 * @author yongqiangwu
 * 
 */
public class Teacher extends User {
	private static final long serialVersionUID = 1L;

	private Title title; // 职称
	private String position; // 职务
	private Education education; // 学历
	private Date armyDate; // 入伍日期

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Date getArmyDate() {
		return armyDate;
	}

	public void setArmyDate(Date armyDate) {
		this.armyDate = armyDate;
	}

	/**
	 * 职称
	 * 
	 * @author yongqiangwu
	 * 
	 */
	public enum Title {
		/**
		 * 教授
		 */
		PROFESSOR,

		/**
		 * 副教授
		 */
		ASSOCIATE_PROFESSOR,

		/**
		 * 讲师
		 */
		LECTURER,

		/**
		 * 助教
		 */
		ASSISTANT;

	}

	/**
	 * 学历
	 * 
	 * @author yongqiangwu
	 * 
	 */
	public enum Education {
		/**
		 * 博士
		 */
		DOCTOR,

		/**
		 * 硕士
		 */
		MASTER,

		/**
		 * 学士
		 */
		BACHELOR;

	}

}
