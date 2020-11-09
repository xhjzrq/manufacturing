package com.rpkj.manufacturing.service;

import com.rpkj.manufacturing.entity.DyMx;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rpkj.manufacturing.entity.OutfTxjList;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xhj
 * @since 2020-11-09
 */
public interface DyMxService extends IService<DyMx> {

    List<DyMx> selectAll (String czbh,String zzth) ;

}
