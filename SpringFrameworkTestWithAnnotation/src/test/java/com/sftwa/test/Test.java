package com.sftwa.test;

import com.sftwa.bean.NotExistBean;
import com.sftwa.service.ReadService;
import com.sftwa.service.UserService;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.Test
    public void testSpringFrameworkWithAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sftwa");
        UserService userService = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);
        ReadService readService = context.getBean("readService", ReadService.class);
        NotExistBean notExistBean = context.getBean("notExistBean", NotExistBean.class);
        userService.printUser();
        System.out.println(userService==userService2);
        String s = context.getBean("myFactoryBean",String.class);
        System.out.println(s);
    }
}
