package com.annotations.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Transport{
    @Override
    public String travell() {
        return "I travelled 5hrs by bus";
    }
}
