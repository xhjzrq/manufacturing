package com.rpkj.manufacturing.service;

import com.rpkj.manufacturing.entity.OutfTxjMtrl;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xhj
 * @since 2020-07-31
 */
public interface OutfTxjMtrlService extends IService<OutfTxjMtrl> {

    List<OutfTxjMtrl> selectAll (String project, String drawingNo) ;

}
