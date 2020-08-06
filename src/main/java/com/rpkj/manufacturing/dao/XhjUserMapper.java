package com.rpkj.manufacturing.dao;

import com.rpkj.manufacturing.entity.XhjUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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
