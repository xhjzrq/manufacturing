package com.rpkj.manufacturing.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
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
    //@ExcelProperty({"工程编号"})
    @TableField("Project")
    private String project;

   // @ExcelProperty({"分段"})
    @TableField("TribonModule")
    private String tribonModule;


    @TableField("SketchName")
    private String sketchName;


   // @ExcelProperty({"部件单号"})
    @TableField("PipeNo")
    private String pipeNo;

    @TableField("DrawingNo")
    private String drawingno;

    @TableField("InTreatment")
    private String inTreatment;

    @TableField("OutTreatment")
    private String outTreatment;

    @TableField("InPaintCode")
    private String inPaintCode;

    @TableField("OutPaintCode")
    private String outPaintCode;

    @TableField("InArea")
    private String inArea;

    @TableField("OutArea")
    private String outArea;

    @TableField("Pressure")
    private String pressure;

    @TableField("PipeWeight")
    private String pipeWeight;

    @TableField("Page")
    private Integer page;

    @TableField("Users")
    private String psers;

    @TableField("CreateDate")
    private Date preateDate;

    @TableField("ModifyDate")
    private Date podifyDate;

    @TableField("ModifyTimes")
    private Integer modifyTimes;

    @TableField("Status")
    private String status;

    @TableField("Memo")
    private String memo;

    @TableField("PipeLineCode")
    private String pipeLineCode;

 @ExcelIgnore
    @TableField(exist=false)
    private List  PipeSketchLists;


//    @Override
//    protected Serializable pkVal() {
//        return null;
//    }

}
