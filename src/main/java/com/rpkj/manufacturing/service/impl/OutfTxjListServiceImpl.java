package com.rpkj.manufacturing.service.impl;

import com.rpkj.manufacturing.entity.OutfTxjList;
import com.rpkj.manufacturing.dao.OutfTxjListMapper;
import com.rpkj.manufacturing.service.OutfTxjListService;
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
    public List<Map<String, String>> getTxList(String project,String drawingNo) {
        return outfTxjListMapper.getTxList(project,drawingNo);

    }

    @Override
    public List<OutfTxjList> selectAll(String project, String drawingNo) {
        return outfTxjListMapper.selectAll(project,drawingNo);
    }



}
