package com.rpkj.manufacturing;

import com.rpkj.manufacturing.dao.OutfTxjListMapper;
import com.rpkj.manufacturing.dao.PipeSketchListMapper;
import com.rpkj.manufacturing.entity.OutfTxjList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class ManufacturingApplicationTests {
@Autowired
private OutfTxjListMapper outfTxjListMapper;

@Autowired
private PipeSketchListMapper pipeSketchListMapper;
    @Test
    void contextLoads() {
        //List<OutfTxjList> outfTxjLists = outfTxjListMapper.selectAll("T308K-5", null);
        List<Map<String, String>> list = pipeSketchListMapper.getDist();
        System.out.println(list.size());


    }

}
