package com.rpkj.manufacturing.controller;


import com.rpkj.manufacturing.entity.DyMx;
import com.rpkj.manufacturing.entity.OutfTxjList;
import com.rpkj.manufacturing.entity.OutfTxjMtrl;
import com.rpkj.manufacturing.service.DyMxService;
import com.rpkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xhj
 * @since 2020-11-09
 */
@RestController
@RequestMapping("/api/dyMx")
@CrossOrigin
public class DyMxController {

    @Autowired
    private DyMxService dyMxService;

    @GetMapping("/dyall")
    public R getAll(String czbh,String zzth){
//        List<OutfTxjList> list = outfTxjListService.list(new QueryWrapper<OutfTxjList>().eq("project", project).eq("drawingNo", drawingNo));
//        List<OutfTxjMtrl> list1 = outfTxjMtrlService.list(new QueryWrapper<OutfTxjMtrl>().eq("project", project).eq("drawingNo", drawingNo));
//
//
        List<DyMx> list = dyMxService.selectAll(czbh,zzth);
        if (list.size()<1){
            return R.error().data("msg","未查询到数据");
        }
        // return R.ok().data("list",outfTxjLists);
        return R.ok().data("list",list);
    }

}

