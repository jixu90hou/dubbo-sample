package com.weweb.service.start;

import com.weweb.api.user.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboService2Start {
    public static void main(String[] args) throws IOException {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo.xml");
        context.start();
        System.out.println("consumer start");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println("consumer");
        System.out.println(userService.findAllUsers());
        System.in.read();
    }
}
