package com.dubbo.api.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.test.ISayHello;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DubboConsumerController {

    @Reference(version = "1.0.0")
    private ISayHello iSayHello;

    @RequestMapping("/testDubbo")
    public void testDubbo(){
        iSayHello.sayHello("Consumer");
    }

}
