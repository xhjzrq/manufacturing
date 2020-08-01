package com.cxkj.manufacturing.dao;

import com.cxkj.manufacturing.entity.XhjUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xhj
 * @since 2020-07-27
 */
public interface XhjUserMapper extends BaseMapper<XhjUser> {

    public List<XhjUser> selecta();

}
