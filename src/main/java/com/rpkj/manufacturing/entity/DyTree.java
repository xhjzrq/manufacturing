package com.rpkj.manufacturing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DY_TREE")
public class DyTree extends Model<DyTree> {

    private static final long serialVersionUID = 1L;

    private String czbh;

    private String dymc;

    private String azth;

    private String zzth;

    private String tzlx;

    private String azqy;

    private String tpmc;

    private String ph;

    private List <DyTreeVO>treelist;




}
