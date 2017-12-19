package ars.module.educate.model;

import ars.database.model.AbstractModel;

/**
 * 课程类型数据模型
 * 
 * @author yongqiangwu
 * 
 */
public class CourseType extends AbstractModel {
	private static final long serialVersionUID = 1L;

	private String code; // 编号
	private String name; // 名称

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

	@Override
	public String toString() {
		return this.name == null ? super.toString() : this.name;
	}

}
