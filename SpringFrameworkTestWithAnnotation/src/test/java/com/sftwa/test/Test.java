package com.sftwa.test;

import com.sftwa.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.Test
    public void testSpringFrameworkWithAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sftwa");
        UserService userService = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);
        userService.printUser();
        System.out.println(userService==userService2);
    }
}
