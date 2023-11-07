package com.annotations.SpringDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Airplane implements Transport{
    @Override
    public String travell() {
        return "for long journeys only :>";
    }
}
