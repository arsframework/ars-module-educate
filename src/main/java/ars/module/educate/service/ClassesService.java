package ars.module.educate.service;

import java.util.Map;
import java.util.List;

import ars.util.SimpleTree;
import ars.invoke.local.Api;
import ars.invoke.local.Param;
import ars.invoke.request.Requester;
import ars.module.educate.model.Classes;
import ars.database.service.BasicService;

/**
 * 教学班级业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/classes")
public interface ClassesService<T extends Classes> extends BasicService<T> {
	/**
	 * 获取班级树（系部/专业/班级）
	 * 
	 * @param requester
	 *            请求对象
	 * @param level
	 *            开始层级
	 * @param parameters
	 *            请求参数
	 * @return 用户组织架构树列表
	 */
	@Api("trees")
	public List<SimpleTree> trees(Requester requester, @Param(name = "level") Integer level,
			Map<String, Object> parameters);

}
