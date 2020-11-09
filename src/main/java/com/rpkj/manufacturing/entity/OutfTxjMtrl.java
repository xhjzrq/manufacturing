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
 * @since 2020-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tribon.OUTF_TXJ_MTRL")
public class OutfTxjMtrl  {
    @ExcelIgnore
    private static final long serialVersionUID = 1L;


    @ExcelProperty({"工程编号"})
    @TableField("Project")
    private String project;

    @ExcelProperty({"制作图号"})
    @TableField("DrawingNo")
    private String drawingNo;

    @ExcelProperty({"部件号"})
    @TableField("ZZJBH")
    private String zzjbh;


    @ExcelIgnore
    @TableField("compID")
    private String compID;


    @ExcelProperty({"标准"})
    @TableField("compDH")
    private String compDH;


    @ExcelProperty({"材料名称"})
    @TableField("compMC")
    private String compMC;


    @ExcelProperty({"材质"})
    @TableField("compCZ")
    private String compCZ;


    @ExcelProperty({"重量kg"})
    @TableField("compWeight")
    private String compWeight;


    @ExcelProperty({"数量"})
    @TableField("compCount")
    private String compCount;

    @ExcelProperty({"面积"})
    private String area;

    @ExcelProperty({"页码"})
    @TableField("Page")
    private Integer page;

    @ExcelProperty({"设计人员"})
    @TableField("Users")
    private String users;

    @ExcelIgnore
    @TableField("Memo")
    private String memo;

    @ExcelIgnore
    private String module;


//    @Override
//    protected Serializable pkVal() {
//        return null;
//    }

}
