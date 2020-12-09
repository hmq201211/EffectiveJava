package com.sftwa.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean<String> {
    @Override
    public String getObject() throws Exception {
        return "hhh";
    }

    @Override
    public Class<?> getObjectType() {
        return String.class;
    }
}
