package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

    @Before("com.demo.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void logToCLoudAsync(){
        System.out.println("/n=====>>> Logging to cloud in async fashion");

    }
}
