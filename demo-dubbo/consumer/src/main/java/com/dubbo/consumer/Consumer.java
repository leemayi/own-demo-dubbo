package com.dubbo.consumer;

import com.dubbo.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("dubbo consumer started ...");
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
        System.in.read();
    }
}
