package com.jay.feignserver.controller;

import com.jay.feignserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jay 2018/11/14 17:00
 * @todo feign调用服务测试
 */

@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name)
    {
        return helloService.sayHiFromClientOne(name);
    }

}
