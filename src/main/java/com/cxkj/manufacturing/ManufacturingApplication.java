package com.cxkj.manufacturing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.cxkj.manufacturing.dao")
public class ManufacturingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManufacturingApplication.class, args);
    }

}
