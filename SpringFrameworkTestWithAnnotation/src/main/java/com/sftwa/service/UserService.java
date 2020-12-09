package com.sftwa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //原型模式, 每次都返回一个新的实例
public class UserService {

    private MailService mailService;

    @Autowired
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }
    public void printUser(){
        mailService.printMail();
        System.out.println("user");
    }
    @PostConstruct
    public void init(){
        System.out.println("userService init");
    }
    @PreDestroy
    public void shutdown() {
        System.out.println("Shutdown userService");
    }
}
