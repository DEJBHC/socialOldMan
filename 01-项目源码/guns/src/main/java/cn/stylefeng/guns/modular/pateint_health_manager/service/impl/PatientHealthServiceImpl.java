package cn.stylefeng.guns.modular.pateint_health_manager.service.impl;

import cn.stylefeng.guns.modular.system.model.PatientHealth;
import cn.stylefeng.guns.modular.system.dao.PatientHealthMapper;
import cn.stylefeng.guns.modular.pateint_health_manager.service.IPatientHealthService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>

 */
@Service
public class PatientHealthServiceImpl extends ServiceImpl<PatientHealthMapper, PatientHealth> implements IPatientHealthService {

    @Override
    public List<PatientHealth> getPatientHealth(Integer cardid) {
        return this.baseMapper.getPatientHealth(cardid);
    }
}
