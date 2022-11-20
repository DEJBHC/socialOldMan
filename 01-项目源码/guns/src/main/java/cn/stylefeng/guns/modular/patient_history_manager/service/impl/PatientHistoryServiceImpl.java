package cn.stylefeng.guns.modular.patient_history_manager.service.impl;

import cn.stylefeng.guns.modular.system.model.PatientHistory;
import cn.stylefeng.guns.modular.system.dao.PatientHistoryMapper;
import cn.stylefeng.guns.modular.patient_history_manager.service.IPatientHistoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class PatientHistoryServiceImpl extends ServiceImpl<PatientHistoryMapper, PatientHistory> implements IPatientHistoryService {

    @Override
    public List<PatientHistory> getHistoryList(Integer cardid) {
        return this.baseMapper.getHistoryList(cardid);
    }
}
