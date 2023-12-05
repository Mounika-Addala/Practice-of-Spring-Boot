package com.demo.aopdemo.service;

import java.util.concurrent.TimeUnit;

public class TrafficFortuneServiceImpl implements TrafficFortuneService {
    @Override
    public String getFortune() {

        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        return "Expect heavy traffic this morning";
    }
}
