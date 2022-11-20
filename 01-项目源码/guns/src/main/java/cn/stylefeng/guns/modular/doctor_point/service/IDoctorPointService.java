package cn.stylefeng.guns.modular.doctor_point.service;

import cn.stylefeng.guns.modular.system.model.DoctorPoint;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IDoctorPointService extends IService<DoctorPoint> {
    List<DoctorPoint> getDoctorList(Integer cardid);
}
