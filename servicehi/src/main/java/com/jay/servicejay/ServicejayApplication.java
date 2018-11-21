package com.jay.servicejay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jay 2018/11/21 18:37
 * @todo 生产者
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServicejayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicejayApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name){

        return "hi," + name + ",i am from port:" + port;

    }
}
