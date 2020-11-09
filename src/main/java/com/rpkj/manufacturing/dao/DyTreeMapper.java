package com.rpkj.manufacturing.dao;

import com.rpkj.manufacturing.entity.DyTree;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xhj
 * @since 2020-11-06
 */
public interface DyTreeMapper extends BaseMapper<DyTree> {

    List<Map<String,String>> getList(@Param("czbh")String czbh, @Param("dymc")String dymc);
    List<Map<String,String>> getListMc(@Param("czbh")String czbh, @Param("dymc")String dymc);



}
