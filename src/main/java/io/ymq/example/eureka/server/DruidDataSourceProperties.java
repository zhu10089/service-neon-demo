package io.ymq.example.eureka.server;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: zhurui
 * @date: 2018/11/20
 * @time: 8:52 AM
 * Copyright (C) 2018 CASDP All rights reserved
 */
@ConfigurationProperties(prefix = "druid")
public class DruidDataSourceProperties {

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
