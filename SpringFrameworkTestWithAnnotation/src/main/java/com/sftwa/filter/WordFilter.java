package com.sftwa.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class WordFilter implements MyFilter {
    @Override
    public void print() {
        System.out.println("word");
    }
}
