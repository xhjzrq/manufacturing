package com.rpkj.manufacturing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-07-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tribon.xhj_user")
//extends Model<XhjUser>
public class XhjUser  {

    private static final long serialVersionUID = 1L;

    private Double ylzd4;

    private String unit;

    private String ylzd1;

    private String ylzd2;

    private String department;

    private Double ylzd5;

    private String realname;

    private String password;

    private String ylzd3;

    @TableId(value = "id")
    private String id;

    private String remark;

    private Double ylzd6;

    private String username;

    private String phone;


//    @Override
//    protected Serializable pkVal() {
//        return this.id;
//    }

}
