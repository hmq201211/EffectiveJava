package com.sftwa.config;

import com.sftwa.annotation.MyAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyInterceptorAdvice {
    @Before("@annotation(myAspect)")
    public void metric(MyAspect myAspect) throws Throwable {
        System.out.println("11111111111111111111111111111");
    }
}
