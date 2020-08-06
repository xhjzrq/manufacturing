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
@TableName("tribon.Pipe_Sketch_JG")
public class PipeSketchJg  {
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

    private String jgxh;

    @TableField("JGFlag")
    private String jGFlag;

    @TableField("StartBend")
    private String startBend;

    @TableField("StraightPipe")
    private String straightPipe;

    @TableField("PipeLine")
    private String pipeLine;

    @TableField("ZJBend")
    private String zJBend;

    @TableField("QJTurn")
    private String qJTurn;

    @TableField("Inclination")
    private String inclination;

    @TableField("GLExcess")
    private String gLExcess;

    @TableField("Radius")
    private String radius;

    @TableField("PreTurn")
    private String preTurn;

    @TableField("AccConnection")
    private String accConnection;

    @TableField("BraClosedLen")
    private String braClosedLen;

    @TableField("BraInclineWay")
    private String braInclineWay;

    @TableField("BraTurnAngle")
    private String braTurnAngle;

    @TableField("BraXDistance")
    private String braXDistance;

    @TableField("Memo")
    private String memo;

    @TableField("InitialAngle")
    private String initialAngle;


//    @Override
//    protected Serializable pkVal() {
//        return null;
//    }

}
