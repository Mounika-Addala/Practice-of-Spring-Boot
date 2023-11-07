package com.annotations.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class Airplane implements Transport{
    @Override
    public String travell() {
        return "for long journeys only :>";
    }
}
