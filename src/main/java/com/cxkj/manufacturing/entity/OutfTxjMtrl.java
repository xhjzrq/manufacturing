package com.cxkj.manufacturing.entity;

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
 * @since 2020-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tribon.OUTF_TXJ_MTRL")
public class OutfTxjMtrl extends Model<OutfTxjMtrl> {

    private static final long serialVersionUID = 1L;

    @TableField("Project")
    private String project;

    @TableField("DrawingNo")
    private String drawingNo;

    @TableField("ZZJBH")
    private String zzjbh;

    @TableField("compID")
    private String compID;

    @TableField("compDH")
    private String compDH;

    @TableField("compMC")
    private String compMC;

    @TableField("compCZ")
    private String compCZ;

    @TableField("compWeight")
    private String compWeight;

    @TableField("compCount")
    private String compCount;

    private String area;

    @TableField("Page")
    private Integer page;

    @TableField("Users")
    private String users;

    @TableField("Memo")
    private String memo;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
