package com.jay.feignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author Jay 2018/11/21 18:37
 * @todo eureka feign实现负载均衡服务
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignserverApplication.class, args);
    }
}
