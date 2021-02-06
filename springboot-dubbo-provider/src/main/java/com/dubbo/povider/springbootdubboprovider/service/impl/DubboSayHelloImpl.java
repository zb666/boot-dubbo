package com.dubbo.povider.springbootdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.test.ISayHello;

@Service(version = "1.0.0") //注解的作用就是发布服务
public class DubboSayHelloImpl implements ISayHello {
    @Override
    public String sayHello(String msg) {
        return "测试连接成功: "+msg;
    }
}
