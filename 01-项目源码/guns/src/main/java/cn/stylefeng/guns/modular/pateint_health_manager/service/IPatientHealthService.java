package cn.stylefeng.guns.modular.pateint_health_manager.service;

import cn.stylefeng.guns.modular.system.model.PatientHealth;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 */
public interface IPatientHealthService extends IService<PatientHealth> {
    List<PatientHealth> getPatientHealth(Integer cardid);
}
