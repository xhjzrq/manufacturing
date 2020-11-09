package com.rpkj.manufacturing.dao;

import com.rpkj.manufacturing.entity.DyMx;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rpkj.manufacturing.entity.OutfTxjList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xhj
 * @since 2020-11-09
 */
public interface DyMxMapper extends BaseMapper<DyMx> {

    List<DyMx> selectAll (@Param("czbh") String czbh,@Param("zzth") String zzth) ;

}
