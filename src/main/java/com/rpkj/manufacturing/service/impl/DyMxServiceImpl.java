package com.rpkj.manufacturing.service.impl;

import com.rpkj.manufacturing.entity.DyMx;
import com.rpkj.manufacturing.dao.DyMxMapper;
import com.rpkj.manufacturing.service.DyMxService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xhj
 * @since 2020-11-09
 */
@Service
public class DyMxServiceImpl extends ServiceImpl<DyMxMapper, DyMx> implements DyMxService {

    @Autowired
    private  DyMxMapper dyMxMapper;

    @Override
    public List<DyMx> selectAll(String czbh,String zzth) {
        return dyMxMapper.selectAll(czbh,zzth);
    }
}
