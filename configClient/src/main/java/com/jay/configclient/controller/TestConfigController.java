package com.jay.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Jay 2018/11/23 14:44
 * @todo 读取配置
 */

@RestController
@RefreshScope
public class TestConfigController {

    //这个@Value会根据配置的配置中心地址找到git仓库对应的配置和本地服务的配置文件
    @Value("${democonfigclient.message}")
    private String foo;


    @RequestMapping("info")
    public String configInfo(){
        return new Date()+ "读取到配置中心foo："+foo;
    }

}
