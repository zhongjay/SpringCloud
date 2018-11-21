package com.jay.feignserver.service.impl;

import com.jay.feignserver.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Jay 2018/11/21 18:37
 * @todo 实现 SchedualServiceHi 接口,起到熔断效果
 */
@Component
//把普通pojo实例化到spring容器中，相当于配置文件中的
//<bean id="" class=""/>）
//
//泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
public class SchedualServiceHiHystric implements HelloService {

    @Override
    public String sayHiFromClientOne(String name) {

        return "sorry,"+name;

    }
}
