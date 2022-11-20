package cn.stylefeng.guns.modular.patient_history_manager.service;

import cn.stylefeng.guns.modular.system.model.PatientHistory;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IPatientHistoryService extends IService<PatientHistory> {
    List<PatientHistory> getHistoryList(Integer cardid);
}
