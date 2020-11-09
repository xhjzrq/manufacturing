package com.rpkj.manufacturing.entity;

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
public class DyMx extends Model<DyMx> {

    private static final long serialVersionUID = 1L;

    private String czbh;

    private String kh;

    private String zzth;

    private String azqy;

    private Double bjxh;

    private String bjdh;

    private String bjmc;

    private String bjgg;

    @TableField("TH")
    private String th;

    private String bjcz;

    private String jldw;

    private Double zzsl;

    private Double bjzl;

    private Double fjsl;

    private String cplx;

    private String gcbm;

    private String gcmc;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
