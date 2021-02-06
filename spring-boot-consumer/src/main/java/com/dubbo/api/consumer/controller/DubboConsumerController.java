package com.dubbo.api.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.test.ISayHello;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/test")
public class DubboConsumerController {

    @Reference(version = "1.0.0")
    private ISayHello iSayHello;

    @RequestMapping("/testDubbo")
    public String testDubbo(){
        String result = iSayHello.sayHello("Consumer");
        System.out.println(result);
        return result;
    }

}
