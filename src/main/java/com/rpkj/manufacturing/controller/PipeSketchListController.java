package com.rpkj.manufacturing.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rpkj.manufacturing.entity.PipeSketchJg;
import com.rpkj.manufacturing.entity.PipeSketchList;
import com.rpkj.manufacturing.entity.PipeSketchMtrl;
import com.rpkj.manufacturing.service.PipeSketchJgService;
import com.rpkj.manufacturing.service.PipeSketchListService;
import com.rpkj.manufacturing.service.PipeSketchMtrlService;
import com.rpkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
 * @since 2020-07-29
 */
@RestController
    @RequestMapping("/api/pipeSketchList")
@CrossOrigin
public class PipeSketchListController {
    @Autowired
    private PipeSketchListService pipeSketchListService;
    
    
    @Autowired
    private PipeSketchMtrlService pipeSketchMtrlService;
    
    @Autowired
    private PipeSketchJgService pipeSketchJgService;
    @GetMapping("/list")
    public R getUserList(String project,String drawingNo){
        System.out.println(project);
        PipeSketchList pipeSketchList=new PipeSketchList();
        List<Map<String,String>> list =pipeSketchListService.getList(project,drawingNo);
       if (list.size()==0){
           return R.error().data("msg","未查询到数据");
       }
       pipeSketchList.setDrawingno(project);
       pipeSketchList.setPipeSketchLists(list);
        return R.ok().data("list",pipeSketchList);
    }

    @GetMapping("/all")
    public R getAll(String project,String drawingNo){
        System.out.println(project);

        List<PipeSketchList> list = pipeSketchListService.list
                (new QueryWrapper<PipeSketchList>().eq("project", project).eq("drawingNo", drawingNo));

        List<PipeSketchMtrl> list1 = pipeSketchMtrlService.list
                (new QueryWrapper<PipeSketchMtrl>().eq("project", project).eq("drawingNo", drawingNo));
        List<PipeSketchJg> list2 = pipeSketchJgService.list
                (new QueryWrapper<PipeSketchJg>().eq("project", project).eq("drawingNo", drawingNo));

        return R.ok().data("list",list).data("list1",list1).data("list2",list2);
    }


    @GetMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response,String project,String drawingNo) throws Exception{
        String fileName="报表";
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        List<PipeSketchList> list = pipeSketchListService.list
                (new QueryWrapper<PipeSketchList>().eq("project", project).eq("drawingNo", drawingNo));
        List<PipeSketchMtrl> list1 = pipeSketchMtrlService.list
                (new QueryWrapper<PipeSketchMtrl>().eq("project", project).eq("drawingNo", drawingNo));
        List<PipeSketchJg> list2 = pipeSketchJgService.list
                (new QueryWrapper<PipeSketchJg>().eq("project", project).eq("drawingNo", drawingNo));
        //这里 需要指定写用哪个class去写
//        EasyExcel.write(response.getOutputStream(), PipeSketchList.class).autoCloseStream(Boolean.TRUE).sheet("one")
//                .doWrite(list);
//        EasyExcel.write(response.getOutputStream(), PipeSketchMtrl.class).autoCloseStream(Boolean.TRUE).sheet("two")
//                .doWrite(list1);
//        EasyExcel.write(response.getOutputStream(), PipeSketchJg.class).autoCloseStream(Boolean.TRUE).sheet("three")
//                .doWrite(list2);
        WriteSheet writeSheet = EasyExcel.writerSheet(0, "管系部件信息").head(PipeSketchList.class).build();
        excelWriter.write(list, writeSheet);

         writeSheet = EasyExcel.writerSheet(1, "管系部件材料明细").head(PipeSketchMtrl.class).build();
        excelWriter.write(list1, writeSheet);

         writeSheet = EasyExcel.writerSheet(2, "管系部件加工明细").head(PipeSketchJg.class).build();
        excelWriter.write(list2, writeSheet);
        //千万别忘记finish 会帮忙关闭流
        excelWriter.finish();
    }


    @GetMapping("/getListDist")
    public R getListDist(){

        PipeSketchList pipeSketchList=new PipeSketchList();
        List<Map<String,String>> list =pipeSketchListService.getDist();
        if (list.size()==0){
            return R.error().data("msg","未查询到数据");
        }
        pipeSketchList.setProject("工程编号");
        pipeSketchList.setPipeSketchLists(list);
        return R.ok().data("list",pipeSketchList);
    }


}

