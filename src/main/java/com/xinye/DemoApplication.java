package com.xinye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = {"com.xinye.mapper"}) //扫描DAO
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//防止新加数据源跟本身原始数据源冲突
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
