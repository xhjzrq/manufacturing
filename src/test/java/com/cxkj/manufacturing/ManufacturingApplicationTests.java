package com.cxkj.manufacturing;

import com.cxkj.manufacturing.dao.OutfTxjListMapper;
import com.cxkj.manufacturing.dao.XhjUserMapper;
import com.cxkj.manufacturing.entity.OutfTxjList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManufacturingApplicationTests {
@Autowired
private XhjUserMapper xhjUserMapper;
    @Test
    void contextLoads() {
        System.out.println(xhjUserMapper.selecta().size());

    }

}
