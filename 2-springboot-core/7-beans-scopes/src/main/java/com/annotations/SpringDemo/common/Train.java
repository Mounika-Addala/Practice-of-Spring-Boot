package com.annotations.SpringDemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Train implements Transport {
    public  Train(){
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String travell() {
        return "I travelled 5kms by train !!!!" ;
    }
}
