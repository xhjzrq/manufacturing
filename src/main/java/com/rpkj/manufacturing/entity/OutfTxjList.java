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
 * @since 2020-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tribon.OUTF_TXJ_LIST")
public class OutfTxjList  {
    @ExcelIgnore
    private static final long serialVersionUID = 1L;

    @TableField("Project")
    private String project;

    private String module;

    @TableField("DrawingNo")
    private String drawingno;

    @TableField("DrawingName")
    private String drawingName;

    @TableField("ZZJID")
    private String zzjid;

    @TableField("ZZJBH")
    private String zzjbh;

    @TableField("ZZJMC")
    private String zzjmc;

    @TableField("ZZJXH")
    private String zzjxh;

    @TableField("ZZJGG")
    private String zzjgg;

    @TableField("ZZJCZ")
    private String zzjcz;

    private String quantity;

    @TableField("Weight")
    private String weight;

    @TableField("Unit")
    private String unit;

    @TableField("PaintArea")
    private String paintArea;

    @TableField("PaintCode")
    private String paintCode;

    @TableField("DEPT")
    private String dept;

    @TableField("Users")
    private String users;

    @TableField("CreateDate")
    private Date createDate;

    @TableField("ModifyDate")
    private Date modifyDate;

    @TableField("ModifyTimes")
    private Integer modifyTimes;

    @TableField("Memo")
    private String memo;


    @TableField(exist=false)
    private List outfTxjListList;

//    @Override
//    protected Serializable pkVal() {
//        return null;
//    }

}
