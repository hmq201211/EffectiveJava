package com.sftwa.service;

import com.sftwa.annotation.MyAspect;
import com.sftwa.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MailService {
    @Value("#{redisConfiguration.host}")
    private String host;
    private List<MyFilter> myFilters;
    @Autowired
    public void setMyFilters( List<MyFilter> myFilters) {
        this.myFilters = myFilters;
    }

    public void printMail() {
        System.out.println("mail");
        System.out.println("-------");
        System.out.println(host);
        for (MyFilter myFilter : myFilters) {
            myFilter.print();
        }
    }
    @MyAspect("intercept")
    public void wantBeIntercepted(){
        System.out.println("be intercepted");
    }
}
