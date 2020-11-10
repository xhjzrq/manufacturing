package com.rpkj.manufacturing.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.rpkj.manufacturing.entity.DyMx;
import com.rpkj.manufacturing.entity.OutfTxjList;
import com.rpkj.manufacturing.entity.OutfTxjMtrl;
import com.rpkj.manufacturing.entity.PipeSketchJg;
import com.rpkj.manufacturing.service.DyMxService;
import com.rpkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
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
    @GetMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response, String czbh, String zzth) throws Exception{
        String fileName="报表";
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        List<DyMx> list = dyMxService.selectAll(czbh,zzth);
//        WriteSheet writeSheet = EasyExcel.writerSheet(0, "单元").head(DyMx.class).build();
//        excelWriter.write(list, writeSheet);
        EasyExcel.write(response.getOutputStream(), DyMx.class).autoCloseStream(Boolean.TRUE).sheet("单元")
                .doWrite(list);
        //千万别忘记finish 会帮忙关闭流
        excelWriter.finish();



    }
}

