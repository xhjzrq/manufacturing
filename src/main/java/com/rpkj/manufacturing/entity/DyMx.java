package com.rpkj.manufacturing.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DY_MX")
public class DyMx {

    @ExcelIgnore
    private static final long serialVersionUID = 1L;

    @ExcelProperty({"船只"})
    private String czbh;

    @ExcelProperty({"名称"})
    private String kh;

    @ExcelProperty({"制作图号"})
    private String zzth;

    @ExcelProperty({"安装图号"})
    private String azqy;

    @ExcelProperty({"序号"})
    private Double bjxh;

    @ExcelProperty({"件号"})
    private String bjdh;

    @ExcelProperty({"名称"})
    private String bjmc;

    @ExcelProperty({"规格"})
    private String bjgg;

    @ExcelProperty({"标准图号"})
    @TableField("TH")
    private String th;

    @ExcelProperty({"材质"})
    private String bjcz;

    @ExcelProperty({"计量单位"})
    private String jldw;

    @ExcelProperty({"数量"})
    private Double zzsl;

    @ExcelProperty({"重量"})
    private Double bjzl;

    @ExcelProperty({"面积"})
    private Double fjsl;

    @ExcelProperty({"系统"})
    private String  xt;
    @ExcelProperty({"来处"})
    private String bjlc;

    @ExcelProperty({"类型"})
    private String cplx;

    @ExcelProperty({"订货单号"})
    private String gcbm;

    @ExcelProperty({"安装位置"})
    private String gcmc;




}
