package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.DoctorPoint;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface DoctorPointMapper extends BaseMapper<DoctorPoint> {
    List<DoctorPoint> getDoctorList(@Param("cardid") Integer cardid);
}
