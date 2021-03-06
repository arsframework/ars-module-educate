package ars.module.educate.service;

import java.util.List;

import ars.util.SimpleTree;
import ars.invoke.local.Api;
import ars.invoke.request.Requester;
import ars.module.educate.model.Chapter;
import ars.database.service.TreeService;
import ars.database.service.BasicService;

/**
 * 课程章节业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/chapter")
public interface ChapterService<T extends Chapter> extends BasicService<T>, TreeService<T> {
	/**
	 * 以课程为根节点返回章节树
	 * 
	 * @param requester
	 *            请求对象
	 * @return 章节树列表
	 */
	@Api("ctrees")
	public List<SimpleTree> ctrees(Requester requester);

}