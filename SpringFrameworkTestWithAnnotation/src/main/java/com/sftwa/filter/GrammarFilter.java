package com.sftwa.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class GrammarFilter implements MyFilter{
    @Override
    public void print() {
        System.out.println("grammar");
    }
}
