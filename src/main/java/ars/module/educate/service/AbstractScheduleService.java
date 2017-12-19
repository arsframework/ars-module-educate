package ars.module.educate.service;

import java.util.Map;

import ars.invoke.request.Requester;
import ars.invoke.request.ParameterInvalidException;
import ars.module.educate.model.Schedule;
import ars.module.educate.service.ScheduleService;
import ars.database.service.StandardGeneralService;

/**
 * 课表业务操作抽象实现
 * 
 * @author yongqiangwu
 * 
 * @param <T>
 *            数据模型
 */
public abstract class AbstractScheduleService<T extends Schedule> extends StandardGeneralService<T>
		implements ScheduleService<T> {

	@Override
	public void initObject(Requester requester, T entity, Map<String, Object> parameters) {
		super.initObject(requester, entity, parameters);
		boolean exists = this.getRepository().query().eq("course", entity.getCourse())
				.eq("classes", entity.getClasses()).eq("teacher", entity.getTeacher()).ne("id", entity.getId())
				.count() > 0;
		if (exists) {
			throw new ParameterInvalidException("classes", "exist");
		}
	}

}
