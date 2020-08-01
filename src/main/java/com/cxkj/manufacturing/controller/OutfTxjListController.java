package com.cxkj.manufacturing.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cxkj.manufacturing.entity.OutfTxjList;
import com.cxkj.manufacturing.entity.OutfTxjMtrl;
import com.cxkj.manufacturing.entity.PipeSketchList;
import com.cxkj.manufacturing.service.OutfTxjListService;
import com.cxkj.manufacturing.service.OutfTxjMtrlService;
import com.cxkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xhj
 * @since 2020-07-31
 */
@RestController
@RequestMapping("/outfTxjList")
@CrossOrigin
public class OutfTxjListController {
    @Autowired
    private OutfTxjListService outfTxjListService;

    @Autowired
    private OutfTxjMtrlService outfTxjMtrlService;
    @GetMapping("/list")
    public R getTxList(String project){
        OutfTxjList outfTxjList = new OutfTxjList();
        List<Map<String,String>> list  =outfTxjListService.getTxList(project);
        if (list.size()==0){
            return R.error().data("msg","未查询到数据");
        }
        outfTxjList.setDrawingno(project);
        outfTxjList.setOutfTxjListList(list);
        return R.ok().data("list",outfTxjList);
    }

    @GetMapping("/txall")
    public R getAll(String project,String drawingNo){
//        List<OutfTxjList> list = outfTxjListService.list(new QueryWrapper<OutfTxjList>().eq("project", project).eq("drawingNo", drawingNo));
//        List<OutfTxjMtrl> list1 = outfTxjMtrlService.list(new QueryWrapper<OutfTxjMtrl>().eq("project", project).eq("drawingNo", drawingNo));
//
//        return R.ok().data("list",list).data("list1",list1);
        List<OutfTxjList> outfTxjLists = outfTxjListService.selectAll();
        return R.ok().data("list",outfTxjLists);
    }

}

