package ars.module.educate.service;

import ars.invoke.local.Api;
import ars.module.educate.model.Schedule;
import ars.database.service.BasicService;

/**
 * 课表业务操作接口
 * 
 * @author yongqiangwu
 * 
 */
@Api("educate/schedule")
public interface ScheduleService<T extends Schedule> extends BasicService<T> {

}
