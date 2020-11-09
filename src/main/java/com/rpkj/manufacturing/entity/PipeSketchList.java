package com.rpkj.manufacturing.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xhj
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tribon.Pipe_Sketch_List")
public class PipeSketchList  {
    @ExcelIgnore
    private static final long serialVersionUID = 1L;
    @ExcelProperty({"工程编号"})
    @TableField("Project")
    private String project;

    @ExcelProperty({"分段"})
    @TableField("TribonModule")
    private String tribonModule;


    @ExcelIgnore
    @TableField("SketchName")
    private String sketchName;


    @ExcelProperty({"部件单号"})
    @TableField("PipeNo")
    private String pipeNo;

 @ExcelProperty({"制作图号"})
    @TableField("DrawingNo")
    private String drawingno;

 @ExcelProperty({"内表面处理"})
    @TableField("InTreatment")
    private String inTreatment;

 @ExcelProperty({"外表面处理"})
    @TableField("OutTreatment")
    private String outTreatment;

 @ExcelProperty({"内涂装代码"})
    @TableField("InPaintCode")
    private String inPaintCode;

 @ExcelProperty({"外涂装代码"})
    @TableField("OutPaintCode")
    private String outPaintCode;

 @ExcelProperty({"内表面积"})
    @TableField("InArea")
    private String inArea;

 @ExcelProperty({"外表面积"})
    @TableField("OutArea")
    private String outArea;

 @ExcelProperty({"压力Mpa"})
    @TableField("Pressure")
    private String pressure;

 @ExcelProperty({"重量Kg"})
    @TableField("PipeWeight")
    private String pipeWeight;

 @ExcelProperty({"页码"})
    @TableField("Page")
    private Integer page;

 @ExcelProperty({"设计人员"})
    @TableField("Users")
    private String psers;

 @ExcelProperty({"建立时间"})
    @TableField("CreateDate")
    private Date preateDate;

 @ExcelProperty({"修改时间"})
    @TableField("ModifyDate")
    private Date podifyDate;

 @ExcelIgnore
    @TableField("ModifyTimes")
    private Integer modifyTimes;
 @ExcelIgnore
    @TableField("Status")
    private String status;
 @ExcelIgnore
    @TableField("Memo")
    private String memo;
 @ExcelProperty({"生产线编码"})
    @TableField("PipeLineCode")
    private String pipeLineCode;

 @ExcelIgnore
    @TableField(exist=false)
    private List    PipeSketchLists;


//    @Override
//    protected Serializable pkVal() {
//        return null;
//    }

}
