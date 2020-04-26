package com.xyz.configuration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyz
 * @date 2020-04-26-19:46
 * {@link Value} 通过value注解实现单个参数的配置
 */


@RestController
public class MyConfig1 {

    @Value("${myconfig.name}")
    private String name;

    @RequestMapping("/config/value")
    public String myConfig() {
        return "value annotation:" + name;
    }
}
