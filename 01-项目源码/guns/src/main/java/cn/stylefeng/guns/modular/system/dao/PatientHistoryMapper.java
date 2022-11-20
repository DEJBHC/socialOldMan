package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.PatientHistory;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface PatientHistoryMapper extends BaseMapper<PatientHistory> {
   List<PatientHistory> getHistoryList(@Param("cardid") Integer cardid);
}
