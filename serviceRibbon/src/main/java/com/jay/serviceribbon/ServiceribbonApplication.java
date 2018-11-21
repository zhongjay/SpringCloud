package com.jay.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jay 2018/11/21 18:37
 * @todo ribbon+Rest 服务
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix //表示开启断路器
@EnableHystrixDashboard /*Hystrix Dashboard，它主要用来实时监控Hystrix的各项指标信息。通过Hystrix Dashboard反馈的实时信息，可以帮助我们快速发现系统中存在的问题*/
@EnableCircuitBreaker
public class ServiceribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceribbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
