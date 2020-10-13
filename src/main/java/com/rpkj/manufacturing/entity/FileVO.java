package com.rpkj.manufacturing.entity;

import lombok.Data;

/**
 * @version V1.0.0
 * @Title: FileVO
 * @Package com.rpkj.manufacturing.entity
 * @Description: pdf 文件属性
 * @author: xhj
 * @date: 2020/9/29 14:26
 */
@Data
public class FileVO {

    private String name;
    private Long size;
}