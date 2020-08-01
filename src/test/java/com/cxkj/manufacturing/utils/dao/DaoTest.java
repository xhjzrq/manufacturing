package com.cxkj.manufacturing.utils.dao;

import com.cxkj.manufacturing.ManufacturingApplication;
import com.cxkj.manufacturing.dao.OutfTxjListMapper;
import com.cxkj.manufacturing.entity.OutfTxjList;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ManufacturingApplication.class)
public class DaoTest {
    @Autowired
    private OutfTxjListMapper outfTxjListMapper;
    @Test
            public void aa(){
                List<OutfTxjList> outfTxjLists = outfTxjListMapper.selectAll();
                System.out.println(outfTxjLists.size());
            }
}
