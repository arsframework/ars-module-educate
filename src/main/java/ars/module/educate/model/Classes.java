package ars.module.educate.model;

import ars.database.model.AbstractModel;

/**
 * 教学班模型
 * 
 * @author linl
 * 
 */
public class Classes extends AbstractModel {
	private static final long serialVersionUID = 1L;

	private String code; // 教学班编号
	private String name; // 教学班名称
	private Integer year; // 教学年度
	private Profession profession;// 所属专业

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return this.name == null ? super.toString() : this.name;
	}

}
