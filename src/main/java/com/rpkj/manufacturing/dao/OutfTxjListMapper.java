package com.rpkj.manufacturing.dao;

import com.rpkj.manufacturing.entity.OutfTxjList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xhj
 * @since 2020-07-31
 */
public interface OutfTxjListMapper extends BaseMapper<OutfTxjList> {

    //@Select("select distinct   RTRIM(LTRIM(drawingno)) AS drawingno  from tribon.OUTF_TXJ_LIST where RTRIM(LTRIM(project)) =#{project} and isnull(drawingno,'')<> ''")
    List<Map<String,String>> getTxList (@Param("project") String project, @Param("drawingNo") String drawingNo);


    List<OutfTxjList> selectAll (@Param("project") String project, @Param("drawingNo") String drawingNo) ;
    //List<OutfTxjList> selectAll () ;


}
