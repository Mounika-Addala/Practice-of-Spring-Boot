package com.annotations.SpringDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Train implements Transport {
    public  Train(){

        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("In doMyStartUpStuff() :" +getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("In doMyCleanUpStuff() :" +getClass().getSimpleName());
    }
    @Override
    public String travell() {
        return "I travelled 5kms by train !!!!" ;
    }
}
