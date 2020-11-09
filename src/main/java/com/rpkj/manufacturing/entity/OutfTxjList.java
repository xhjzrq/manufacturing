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
 * @since 2020-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tribon.OUTF_TXJ_LIST")
public class OutfTxjList  {
    @ExcelIgnore
    private static final long serialVersionUID = 1L;

    @ExcelProperty({"工程编号"})
    @TableField("Project")
    private String project;

    @ExcelProperty({"分段"})
    private String module;

    @ExcelProperty({"制作图号"})
    @TableField("DrawingNo")
    private String drawingno;

    @ExcelIgnore
    @TableField("DrawingName")
    private String drawingName;

    @ExcelIgnore
    @TableField("ZZJID")
    private String zzjid;

    @ExcelProperty({"部件号"})
    @TableField("ZZJBH")
    private String zzjbh;

    @ExcelProperty({"部件名称"})
    @TableField("ZZJMC")
    private String zzjmc;

    @ExcelProperty({"型号"})
    @TableField("ZZJXH")
    private String zzjxh;

    @ExcelProperty({"规格"})
    @TableField("ZZJGG")
    private String zzjgg;

    @ExcelProperty({"材质"})
    @TableField("ZZJCZ")
    private String zzjcz;

    @ExcelProperty({"数量"})
    private String quantity;

    @ExcelProperty({"重量kg"})
    @TableField("Weight")
    private String weight;

    @ExcelProperty({"单位"})
    @TableField("Unit")
    private String unit;

    @ExcelProperty({"面积"})
    @TableField("PaintArea")
    private String paintArea;

    @ExcelProperty({"涂装代码"})
    @TableField("PaintCode")
    private String paintCode;

    @ExcelProperty({"设计科室"})
    @TableField("DEPT")
    private String dept;

    @ExcelIgnore
    @TableField("Users")
    private String users;

    @ExcelProperty({"建立时间"})
    @TableField("CreateDate")
    private Date createDate;

    @ExcelIgnore
    @TableField("ModifyDate")
    private Date modifyDate;

    @ExcelIgnore
    @TableField("ModifyTimes")
    private Integer modifyTimes;

    @ExcelIgnore
    @TableField("Memo")
    private String memo;

    @ExcelIgnore
    @TableField(exist=false)
    private List outfTxjListList;

//    @Override
//    protected Serializable pkVal() {
//        return null;
//    }

}
