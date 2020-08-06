package com.rpkj.manufacturing.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xhj
 * @since 2020-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tribon.Pipe_Sketch_Mtrl")
public class PipeSketchMtrl {
    @ExcelIgnore
    private static final long serialVersionUID = 1L;

    @TableField("SketchName")
    private String sketchName;

    @TableField("DrawingNo")
    private String drawingNo;

    @TableField("Project")
    private String project;

    @TableField("TribonModule")
    private String tribonModule;

    @TableField("PipeNo")
    private String pipeNo;

    @TableField("MtrlPos")
    private String mtrlPos;

    @TableField("MtrlFlag")
    private String mtrlFlag;

    @TableField("MtrlName")
    private String mtrlName;

    @TableField("MtrlGG")
    private String mtrlGG;

    @TableField("MtrlXHCZ")
    private String mtrlXHCZ;

    @TableField("MtrlQuantity")
    private String mtrlQuantity;

    @TableField("MtrlUnit")
    private String mtrlUnit;

    @TableField("MtrlBuildLength")
    private String mtrlBuildLength;

    @TableField("MtrlWeight")
    private String mtrlWeight;

    @TableField("Memo")
    private String memo;

    @TableField("MtrlGGXHCZ")
    private String mtrlGGXHCZ;




}
