package com.cxkj.manufacturing.dao;

import com.cxkj.manufacturing.entity.OutfTxjList;
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

    @Select("select distinct   RTRIM(LTRIM(drawingno)) AS drawingno  from tribon.OUTF_TXJ_LIST where RTRIM(LTRIM(project)) =#{project} and isnull(drawingno,'')<> ''")
    List<Map<String,String>> getTxList (@Param("project") String project);


//    List<OutfTxjList> selectAll (String project,String drawingNo) ;
    List<OutfTxjList> selectAll () ;


}
