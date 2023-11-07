package com.annotations.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class Car implements Transport{
    @Override
    public String travell() {
        return "comfortable to travel";
    }
}
