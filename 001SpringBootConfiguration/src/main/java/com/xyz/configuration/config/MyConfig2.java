package com.xyz.configuration.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyz
 * @date 2020-04-26-22:12
 * {@link ConfigurationProperties} 批量配置参数，需要实现参数的get和set方法
 * {@link Import} 通过Import注解把普通类导入IOC容器
 */

@RestController
@ConfigurationProperties(prefix = "myconfig")
@Data
public class MyConfig2 {

    @Autowired
    private MyConfig1 myConfig1;

    private String name;
    private int id;
    private String desc;

    @RequestMapping("/config/property")
    public String myConfig() {
        return "name:"  + name + ",id:" + id + ",desc:" + desc;
    }
}
