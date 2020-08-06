package com.rpkj.manufacturing.service.impl;

import com.rpkj.manufacturing.entity.OutfTxjMtrl;
import com.rpkj.manufacturing.dao.OutfTxjMtrlMapper;
import com.rpkj.manufacturing.service.OutfTxjMtrlService;
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
 * @since 2020-07-31
 */
@Service
public class OutfTxjMtrlServiceImpl extends ServiceImpl<OutfTxjMtrlMapper, OutfTxjMtrl> implements OutfTxjMtrlService {
@Autowired
    private OutfTxjMtrlMapper outfTxjMtrlMapper;

    @Override
    public List<OutfTxjMtrl> selectAll(String project, String drawingNo) {
        return outfTxjMtrlMapper.selectAll(project,drawingNo);
    }
}
