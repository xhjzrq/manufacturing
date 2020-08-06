package com.rpkj.manufacturing.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.rpkj.manufacturing.entity.OutfTxjList;
import com.rpkj.manufacturing.entity.OutfTxjMtrl;
import com.rpkj.manufacturing.service.OutfTxjListService;
import com.rpkj.manufacturing.service.OutfTxjMtrlService;
import com.rpkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
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
    public R getTxList(String project,String drawingNo){
        OutfTxjList outfTxjList = new OutfTxjList();
        List<Map<String,String>> list  =outfTxjListService.getTxList(project,drawingNo);
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
//
       List<OutfTxjList> list = outfTxjListService.selectAll(project,drawingNo);
        List<OutfTxjMtrl> list1 = outfTxjMtrlService.selectAll(project, drawingNo);
        // return R.ok().data("list",outfTxjLists);
        return R.ok().data("list",list).data("list1",list1);
    }

    @GetMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response, String project, String drawingNo) throws Exception{
        String fileName="报表";
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        List<OutfTxjList> list = outfTxjListService.selectAll(project,drawingNo);
        List<OutfTxjMtrl> list1 = outfTxjMtrlService.selectAll(project, drawingNo);
        //这里 需要指定写用哪个class去写
//        EasyExcel.write(response.getOutputStream(), PipeSketchList.class).autoCloseStream(Boolean.TRUE).sheet("one")
//                .doWrite(list);
//        EasyExcel.write(response.getOutputStream(), PipeSketchMtrl.class).autoCloseStream(Boolean.TRUE).sheet("two")
//                .doWrite(list1);
//        EasyExcel.write(response.getOutputStream(), PipeSketchJg.class).autoCloseStream(Boolean.TRUE).sheet("three")
//                .doWrite(list2);
        WriteSheet writeSheet = EasyExcel.writerSheet(0, "部件").head(OutfTxjList.class).build();
        excelWriter.write(list, writeSheet);

        writeSheet = EasyExcel.writerSheet(1, "材料").head(OutfTxjMtrl.class).build();
        excelWriter.write(list1, writeSheet);

        //千万别忘记finish 会帮忙关闭流
        excelWriter.finish();



    }

}

