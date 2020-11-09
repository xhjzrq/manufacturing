package com.rpkj.manufacturing.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @version V1.0.0
 * @Title: DyTreeVO
 * @Package com.rpkj.manufacturing.entity
 * @Description: 树
 * @author: xhj
 * @date: 2020/11/6 10:06
 */
@Data
public class DyTreeVO {

    private String czbh;

    private List <Map<String,String>> treelist;

}