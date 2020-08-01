package com.cxkj.manufacturing.service.impl;

import com.cxkj.manufacturing.entity.OutfTxjList;
import com.cxkj.manufacturing.dao.OutfTxjListMapper;
import com.cxkj.manufacturing.service.OutfTxjListService;
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
 * @since 2020-07-31
 */
@Service
public class OutfTxjListServiceImpl extends ServiceImpl<OutfTxjListMapper, OutfTxjList> implements OutfTxjListService {

    @Autowired
    private  OutfTxjListMapper outfTxjListMapper;


    @Override
    public List<Map<String, String>> getTxList(String project) {
        return outfTxjListMapper.getTxList(project);

    }

    @Override
    public List<OutfTxjList> selectAll() {
        return outfTxjListMapper.selectAll();
    }

}
