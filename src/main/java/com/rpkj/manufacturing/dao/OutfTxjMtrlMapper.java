package com.rpkj.manufacturing.dao;

import com.rpkj.manufacturing.entity.OutfTxjMtrl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xhj
 * @since 2020-07-31
 */
public interface OutfTxjMtrlMapper extends BaseMapper<OutfTxjMtrl> {


    List<OutfTxjMtrl> selectAll(@Param("project") String project, @Param("drawingNo") String drawingNo) ;

}
