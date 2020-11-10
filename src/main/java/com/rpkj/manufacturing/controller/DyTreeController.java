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

import java.util.*;

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
            List<Map<String, String>> listMc = dyTreeService.getListMc(czbh, rdymc.substring(0,4));
            List<Map<String, String>> listMc1=new ArrayList<>();
//            for (int i=0;i<listMc.size();i++){
//                String temp=listMc.get(i).get(czbh);
//                if ("安装图"==temp.substring(temp.length()-3,temp.length())){
//
//                }
//            }
            Collections.sort(listMc, new Comparator<Map<String, String>>() {
                @Override
                public int compare(Map<String, String> o1, Map<String, String> o2) {
                    String  aaa=o1.get("czbh").substring(o1.get("czbh").length()-3,o1.get("czbh").length());
                    if (aaa.equals("安装图")){
                        System.out.println("123456");
                        return -1;
                    }else{
                        return 1;
                    }

                }
            });
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

