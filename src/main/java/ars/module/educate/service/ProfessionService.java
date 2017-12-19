package ars.module.educate.service;

import java.util.Map;
import java.util.List;

import ars.util.SimpleTree;
import ars.invoke.local.Api;
import ars.invoke.local.Param;
import ars.invoke.request.Requester;
import ars.database.service.BasicService;
import ars.database.service.ExportService;
import ars.database.service.ImportService;
import ars.module.educate.model.Profession;

/**
 * 专业业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/profession")
public interface ProfessionService<T extends Profession> extends BasicService<T>, ImportService<T>, ExportService<T> {
	/**
	 * 获取专业树列表（部门作为树枝）
	 * 
	 * @param requester
	 *            请求对象
	 * @param level
	 *            开始层级
	 * @param parameters
	 *            请求参数
	 * @return 教员树列表
	 */
	@Api("trees")
	public List<SimpleTree> trees(Requester requester, @Param(name = "level") Integer level,
			Map<String, Object> parameters);

}
