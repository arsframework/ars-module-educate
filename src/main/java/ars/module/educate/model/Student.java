package ars.module.educate.model;

import ars.module.people.model.User;

import java.util.Date;

/**
 * 学生数据模型
 * 
 * @author linl
 * 
 */
public class Student extends User {
	private static final long serialVersionUID = 1L;

	/**
	 * 在校状态
	 */
	public static final int NORMAL = 0;

	/**
	 * 留级状态
	 */
	public static final int REPEAT = 1;

	/**
	 * 退学状态
	 */
	public static final int DROPOUT = 2;

	/**
	 * 结业状态
	 */
	public static final int GRADUATE = 3;

	private Classes classes;// 教学班
	private Date entryDate; // 入学日期
	private Date finishDate; // 毕业日期

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

}
