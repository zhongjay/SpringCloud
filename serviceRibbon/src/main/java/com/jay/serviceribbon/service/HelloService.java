package com.jay.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jay 2018/11/14 17:01
 * @todo
 */

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    //断路器配置，当无法调用如下方法时，就会调用自定的hiError方法。
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {

        //调用 /hi 接口，这里用服务名 SERVICE-HI 代替具体的 URL：
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);

    }

    public String hiError(String name)
    {
        return "hey " +
                name + ", there is some problem with hi page,please try again";
    }

}
