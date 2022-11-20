package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.PatientInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface PatientInfoMapper extends BaseMapper<PatientInfo> {
    List<PatientInfo> BaseResultMap(@Param("cardid") Integer cardid);
}
