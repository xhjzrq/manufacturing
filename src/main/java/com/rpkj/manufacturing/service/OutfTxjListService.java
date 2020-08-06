package com.rpkj.manufacturing.service;

import com.rpkj.manufacturing.entity.OutfTxjList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xhj
 * @since 2020-07-31
 */
public interface OutfTxjListService extends IService<OutfTxjList> {
    List<Map<String,String>> getTxList (String project,String drawingNo);
    List<OutfTxjList> selectAll (String project,String drawingNo) ;

}
