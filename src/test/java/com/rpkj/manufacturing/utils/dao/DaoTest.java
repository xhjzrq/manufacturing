package com.rpkj.manufacturing.utils.dao;

import com.rpkj.manufacturing.ManufacturingApplication;
import com.rpkj.manufacturing.dao.OutfTxjListMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ManufacturingApplication.class)
public class DaoTest {
    @Autowired
    private OutfTxjListMapper outfTxjListMapper;

}
