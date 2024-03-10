package com.weike.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: GulimallProductApplication
 * @Author: YuanDing
 * @Date: 2024/3/8 23:00
 * @Description:
 */

@SpringBootApplication
@MapperScan("com.weike.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class , args);
    }
}
