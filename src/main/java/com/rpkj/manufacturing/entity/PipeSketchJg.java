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
@TableName("tribon.Pipe_Sketch_JG")
public class PipeSketchJg  {
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

    @ExcelProperty({"加工序号"})
    @TableField("jGXH")
    private String jgxh;

    @ExcelProperty({"标识"})
    @TableField("JGFlag")
    private String jGFlag;

    @ExcelProperty({"起弯点"})
    @TableField("StartBend")
    private String startBend;

    @ExcelProperty({"直管段"})
    @TableField("StraightPipe")
    private String straightPipe;

    @ExcelProperty({"身长"})
    @TableField("PipeLine")
    private String pipeLine;

    @ExcelProperty({"转角"})
    @TableField("ZJBend")
    private String zJBend;

    @ExcelProperty({"曲角"})
    @TableField("QJTurn")
    private String qJTurn;

    @ExcelProperty({"夹角"})
    @TableField("Inclination")
    private String inclination;

    @ExcelProperty({"割量"})
    @TableField("GLExcess")
    private String gLExcess;

    @ExcelProperty({"弯模"})
    @TableField("Radius")
    private String radius;

    @ExcelProperty({"预转角"})
    @TableField("PreTurn")
    private String preTurn;

   @ExcelProperty({"附件连接"})
    @TableField("AccConnection")
    private String accConnection;
@ExcelIgnore
    @TableField("BraClosedLen")
    private String braClosedLen;
    @ExcelIgnore
    @TableField("BraInclineWay")
    private String braInclineWay;
    @ExcelIgnore
    @TableField("BraTurnAngle")
    private String braTurnAngle;
    @ExcelIgnore
    @TableField("BraXDistance")
    private String braXDistance;
    @ExcelIgnore
    @TableField("Memo")
    private String memo;
    @ExcelIgnore
    @TableField("InitialAngle")
    private String initialAngle;


//    @Override
//    protected Serializable pkVal() {
//        return null;
//    }

}
