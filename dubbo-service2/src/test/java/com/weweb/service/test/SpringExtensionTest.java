package com.weweb.service.test;

import com.weweb.api.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.*;
import org.junit.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration({"/dubbo.xml"})
public class SpringExtensionTest{
    @Autowired
    private UserService userService;
    @Test
    public void testUsers(){
        System.out.println(userService.findAllUsers());
    }
}