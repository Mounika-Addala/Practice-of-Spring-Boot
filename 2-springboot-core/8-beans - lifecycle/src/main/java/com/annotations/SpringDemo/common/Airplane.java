package com.annotations.SpringDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Airplane implements Transport{
    public  Airplane(){
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String travell() {
        return "for long journeys only :>";
    }
}
