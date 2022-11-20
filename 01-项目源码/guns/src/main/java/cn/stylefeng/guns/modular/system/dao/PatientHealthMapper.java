package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.PatientHealth;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface PatientHealthMapper extends BaseMapper<PatientHealth> {
    List<PatientHealth> getPatientHealth(@Param("cardid") Integer cardid);

}
