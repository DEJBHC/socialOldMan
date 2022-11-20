package cn.stylefeng.guns.modular.doctor_point.service.impl;

import cn.stylefeng.guns.modular.system.model.DoctorPoint;
import cn.stylefeng.guns.modular.system.dao.DoctorPointMapper;
import cn.stylefeng.guns.modular.doctor_point.service.IDoctorPointService;
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
public class DoctorPointServiceImpl extends ServiceImpl<DoctorPointMapper, DoctorPoint> implements IDoctorPointService {

    @Override
    public List<DoctorPoint> getDoctorList(Integer cardid) {
        return this.baseMapper.getDoctorList(cardid);
    }
}
