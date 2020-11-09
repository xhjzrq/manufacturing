package com.rpkj.manufacturing.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
    @ExcelIgnore
    @TableField("SketchName")
    private String sketchName;

    @ExcelProperty({"制作图号"})
    @TableField("DrawingNo")
    private String drawingNo;

    @ExcelProperty({"工程编号"})
    @TableField("Project")
    private String project;

    @ExcelProperty({"分段"})
    @TableField("TribonModule")
    private String tribonModule;

    @ExcelProperty({"部件号"})
    @TableField("PipeNo")
    private String pipeNo;

    @ExcelProperty({"材料序号"})
    @TableField("MtrlPos")
    private String mtrlPos;

    @ExcelProperty({"标识"})
    @TableField("MtrlFlag")
    private String mtrlFlag;

    @ExcelProperty({"名称"})
    @TableField("MtrlName")
    private String mtrlName;

    @ExcelProperty({"规格"})
    @TableField("MtrlGG")
    private String mtrlGG;

    @ExcelProperty({"型号材质"})
    @TableField("MtrlXHCZ")
    private String mtrlXHCZ;

    @ExcelProperty({"数量"})
    @TableField("MtrlQuantity")
    private String mtrlQuantity;

    @ExcelProperty({"单位"})
    @TableField("MtrlUnit")
    private String mtrlUnit;

    @ExcelProperty({"制造长度mm"})
    @TableField("MtrlBuildLength")
    private String mtrlBuildLength;

    @ExcelProperty({"重量Kg"})
    @TableField("MtrlWeight")
    private String mtrlWeight;

    @ExcelIgnore
    @TableField("Memo")
    private String memo;

    @ExcelIgnore
    @TableField("MtrlGGXHCZ")
    private String mtrlGGXHCZ;




}
