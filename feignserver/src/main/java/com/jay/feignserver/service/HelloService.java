package com.jay.feignserver.service;

import com.jay.feignserver.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jay 2018/11/14 17:01
 * @todo 接口
 */

@Service
@FeignClient(value="service-hi",fallback = SchedualServiceHiHystric.class)//指的是调用service-hi这个服务
// fallback: 定义容错的处理类，当调用远程接口失败或超时时，会调用对应接口的容错逻辑，fallback指定的类必须实现@FeignClient标记的接口
public interface HelloService {


    @RequestMapping(value = "/hi",method = RequestMethod.GET) //调用service-hi这个服务的 /hi 这个接口
    String sayHiFromClientOne(@RequestParam("name")String name);

}
