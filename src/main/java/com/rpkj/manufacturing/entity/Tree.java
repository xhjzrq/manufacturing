package com.rpkj.manufacturing.entity;

import lombok.Data;

import java.util.List;

@Data
public class Tree {
    private String drawingno;
    private List<Tree> children;
}
