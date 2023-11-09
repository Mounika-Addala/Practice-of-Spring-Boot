package com.annotations.SpringDemo.config;

import com.annotations.SpringDemo.common.Bike;
import com.annotations.SpringDemo.common.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Journey {

    @Bean("ride")
    public Transport Bike(){
        return new Bike();
    }
}
