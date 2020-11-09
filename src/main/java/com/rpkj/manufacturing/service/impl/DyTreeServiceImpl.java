package com.rpkj.manufacturing.service.impl;

import com.rpkj.manufacturing.entity.DyTree;
import com.rpkj.manufacturing.dao.DyTreeMapper;
import com.rpkj.manufacturing.service.DyTreeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xhj
 * @since 2020-11-06
 */
@Service
public class DyTreeServiceImpl extends ServiceImpl<DyTreeMapper, DyTree> implements DyTreeService {

    @Autowired
    private DyTreeMapper dyTreeMapper;

    @Override
    public List<Map<String, String>> getList(String czbh, String dymc) {
        return  dyTreeMapper.getList(czbh,dymc);
    }

    @Override
    public List<Map<String, String>> getListMc(String czbh, String dymc) {
        return  dyTreeMapper.getListMc(czbh,dymc);
    }
}
