package ars.module.educate.model;

import ars.database.model.AbstractModel;

/**
 * 课程数据模型
 * 
 * @author yongqiangwu
 * 
 */
public class Course extends AbstractModel {
	private static final long serialVersionUID = 1L;

	private String logo; // 图片
	private String code; // 编号
	private String name; // 名称
	private CourseType type; // 课程类型
	private Boolean required = false; // 是否必修

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

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

	public CourseType getType() {
		return type;
	}

	public void setType(CourseType type) {
		this.type = type;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	@Override
	public String toString() {
		return this.name == null ? super.toString() : this.name;
	}

}
