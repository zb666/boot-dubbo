package com.dubbo.api.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.test.ISayHello;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RequestMapping("/test")
@RestController
public class DubboConsumerController {

    @Reference
    private ISayHello iSayHello;

    @RequestMapping("/testDubbo")
    public String testDubbo(){
        String result = iSayHello.sayHello(
                "Consumer");
        System.out.println(result);
        return result;
    }

}
