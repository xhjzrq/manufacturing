package com.cxkj.manufacturing.dao;

import com.cxkj.manufacturing.entity.PipeSketchList;
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
 * @since 2020-07-29
 */
public interface PipeSketchListMapper extends BaseMapper<PipeSketchList> {

    @Select("select distinct  drawingno from tribon.Pipe_Sketch_List where Project =#{project} and isnull(drawingno,'')<> ''")
     List<Map<String,String>>  getList(@Param("project") String project);

}
