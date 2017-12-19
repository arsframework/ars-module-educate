package ars.module.educate.model;

import ars.module.people.model.Group;
import ars.database.model.AbstractModel;

/**
 * 专业数据模型
 * 
 * @author linl
 * 
 */
public class Profession extends AbstractModel {
	private static final long serialVersionUID = 1L;

	private String code; // 专业编号
	private String name; // 专业名称
	private Group department;// 所属系部

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

	public Group getDepartment() {
		return department;
	}

	public void setDepartment(Group department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return this.name == null ? super.toString() : this.name;
	}

}
