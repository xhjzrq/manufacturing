package com.cxkj.manufacturing.service;

import com.cxkj.manufacturing.entity.PipeSketchList;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xhj
 * @since 2020-07-29
 */
public interface PipeSketchListService extends IService<PipeSketchList> {
    List<Map<String,String>> getList(String project);
}
