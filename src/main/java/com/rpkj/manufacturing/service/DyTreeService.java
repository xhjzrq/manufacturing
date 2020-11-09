package com.rpkj.manufacturing.service;

import com.rpkj.manufacturing.entity.DyTree;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xhj
 * @since 2020-11-06
 */
public interface DyTreeService extends IService<DyTree> {

    List<Map<String,String>> getList(String czbh, String dymc);
    List<Map<String,String>> getListMc(String czbh, String dymc);

}
