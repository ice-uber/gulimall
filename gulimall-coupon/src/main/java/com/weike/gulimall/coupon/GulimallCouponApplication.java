package com.weike.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: GulimallProductApplication
 * @Author: YuanDing
 * @Date: 2024/3/8 23:00
 * @Description:
 */

@SpringBootApplication
@MapperScan("com.weike.gulimall.coupon.dao")
@EnableDiscoveryClient // 开启服务注册发现
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class , args);
    }




}
