package com.sftwa.bean;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Conditional(NonExistCondition.class)
public class NotExistBean {
    @PostConstruct
    public void init(){
        System.out.println("not exist");
    }
}
