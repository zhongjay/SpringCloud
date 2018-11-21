package com.jay.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Jay 2018/11/21 18:37
 * @todo zuul网关服务
 */
@SpringBootApplication
@EnableZuulProxy
public class ServicezuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicezuulApplication.class, args);
    }
}
