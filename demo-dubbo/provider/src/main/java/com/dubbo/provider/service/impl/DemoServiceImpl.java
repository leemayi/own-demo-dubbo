package com.dubbo.provider.service.impl;

import com.dubbo.api.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
