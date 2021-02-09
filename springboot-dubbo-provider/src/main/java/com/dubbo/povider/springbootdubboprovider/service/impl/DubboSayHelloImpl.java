package com.dubbo.povider.springbootdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.test.ISayHello;
import org.apache.dubbo.config.annotation.DubboService;

//发布了服务
@DubboService(version = "1.0.0")
public class DubboSayHelloImpl implements ISayHello {
    @Override
    public String sayHello(String msg) {
        return "测试连接成功: "+msg;
    }
}
