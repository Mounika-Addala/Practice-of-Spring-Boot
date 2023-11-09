package com.annotations.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Transport{
    public  Bus(){
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String travell() {
        return "I travelled 5hrs by bus";
    }
}
