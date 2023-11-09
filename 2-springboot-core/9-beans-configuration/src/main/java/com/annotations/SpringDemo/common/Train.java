package com.annotations.SpringDemo.common;


import org.springframework.stereotype.Component;

@Component
public class Train implements Transport {
    public  Train(){

        System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @Override
    public String travell() {
        return "I travelled 5kms by train !!!!" ;
    }
}
