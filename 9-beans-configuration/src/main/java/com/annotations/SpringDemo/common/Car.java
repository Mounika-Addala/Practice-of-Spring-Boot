package com.annotations.SpringDemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Car implements Transport{
    public Car(){
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String travell() {
        return "comfortable to travel";
    }
}
