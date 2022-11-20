package cn.stylefeng.guns.modular.patient.service.impl;

import cn.stylefeng.guns.modular.system.model.PatientInfo;
import cn.stylefeng.guns.modular.system.dao.PatientInfoMapper;
import cn.stylefeng.guns.modular.patient.service.IPatientInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class PatientInfoServiceImpl extends ServiceImpl<PatientInfoMapper, PatientInfo> implements IPatientInfoService {

    @Override
    public List<PatientInfo> selectpatientInfoList(Integer cardid) {
        return this.baseMapper.BaseResultMap(cardid);
    }


}
