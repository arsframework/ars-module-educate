package ars.module.educate.model;

import java.util.Set;
import java.util.HashSet;

import ars.module.system.model.Attachment;
import ars.database.model.AbstractTreeModel;

/**
 * 课程章节数据模型
 * 
 * @author yongqiangwu
 * 
 */
public class Chapter extends AbstractTreeModel<Chapter> {
	private static final long serialVersionUID = 1L;

	private String name; // 章节名字
	private Course course; // 所属课程
	private String content; // 章节内容
	private Set<Attachment> attachments = new HashSet<Attachment>(0);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(Set<Attachment> attachments) {
		this.attachments = attachments;
	}

	@Override
	public String toString() {
		return this.name == null ? super.toString() : this.name;
	}

}
