package com.rpkj.manufacturing.controller;


import com.rpkj.manufacturing.entity.DyTree;
import com.rpkj.manufacturing.entity.DyTreeVO;
import com.rpkj.manufacturing.service.DyTreeService;
import com.rpkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xhj
 * @since 2020-11-06
 */
@RestController
@RequestMapping("/api/dyTree")
@CrossOrigin
public class DyTreeController {

    @Autowired
    private DyTreeService dyTreeService;


    @GetMapping("/list")
    public R getTxList(String czbh, String dymc){
        List<Map<String, String>> mapList = dyTreeService.getList(czbh, dymc);
        DyTreeVO  dyTreeVO =null;
        List <DyTreeVO> dyTreeVOList=new ArrayList<>();
        for(Map<String,String> list : mapList){
            String rdymc= list.get("dymc");
             dyTreeVO= new DyTreeVO();
            List<Map<String, String>> listMc = dyTreeService.getListMc(czbh, rdymc.substring(4,rdymc.length()));
            dyTreeVO.setCzbh(rdymc);
            dyTreeVO.setTreelist(listMc);
            dyTreeVOList.add(dyTreeVO);

        }

        DyTree dyTree =new DyTree();
        dyTree.setCzbh(czbh);
        dyTree.setTreelist(dyTreeVOList);

        return R.ok().data("list",dyTree);




    }

}

