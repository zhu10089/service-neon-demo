package io.ymq.example.eureka.server;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * @description:
 * @author: zhurui
 * @date: 2018/11/20
 * @time: 8:50 AM
 * Copyright (C) 2018 CASDP All rights reserved
 */
@Configurable
@EnableConfigurationProperties(DruidDataSourceProperties.class)
public class DruidDataSourceConfig {

    @Resource
    private DruidDataSourceProperties properties;

    @Bean
    public void readProperties() {
        System.out.println(properties.getPassword());
        System.out.println(properties.getUrl());
        System.out.println(properties.getUsername());
    }

}
