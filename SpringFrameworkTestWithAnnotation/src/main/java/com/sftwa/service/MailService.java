package com.sftwa.service;

import com.sftwa.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MailService {
    private List<MyFilter> myFilters;
    @Autowired
    public void setMyFilters( List<MyFilter> myFilters) {
        this.myFilters = myFilters;
    }

    public void printMail() {
        System.out.println("mail");

        for (MyFilter myFilter : myFilters) {
            myFilter.print();
        }
    }
}
