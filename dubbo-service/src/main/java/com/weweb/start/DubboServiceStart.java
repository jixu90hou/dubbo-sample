package com.weweb.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboServiceStart {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
