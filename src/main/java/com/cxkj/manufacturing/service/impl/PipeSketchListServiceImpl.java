package com.cxkj.manufacturing.service.impl;

import com.cxkj.manufacturing.entity.PipeSketchList;
import com.cxkj.manufacturing.dao.PipeSketchListMapper;
import com.cxkj.manufacturing.service.PipeSketchListService;
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
 * @since 2020-07-29
 */
@Service
public class PipeSketchListServiceImpl extends ServiceImpl<PipeSketchListMapper, PipeSketchList> implements PipeSketchListService {
    @Autowired
    private PipeSketchListMapper pipeSketchListMapper;


    @Override
    public List<Map<String, String>> getList(String project) {
        return pipeSketchListMapper.getList(project);
    }
}
