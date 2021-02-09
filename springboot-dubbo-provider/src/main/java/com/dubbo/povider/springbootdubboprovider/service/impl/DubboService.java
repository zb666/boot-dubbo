package com.dubbo.povider.springbootdubboprovider.service.impl;

import com.dubbo.api.test.ISayHello;
import org.springframework.web.bind.annotation.RequestMapping;

@org.apache.dubbo.config.annotation.DubboService
public class DubboService implements ISayHello {

    @Override
    public String sayHello(String msg) {
        return "HelloService"+msg;
    }

}
