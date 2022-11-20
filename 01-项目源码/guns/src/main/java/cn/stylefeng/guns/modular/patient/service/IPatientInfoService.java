package cn.stylefeng.guns.modular.patient.service;

import cn.stylefeng.guns.modular.system.model.PatientInfo;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IPatientInfoService extends IService<PatientInfo> {
    List<PatientInfo> selectpatientInfoList(Integer cardid);
}
