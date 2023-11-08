package com.annotations.SpringDemo.common;

public class Bike implements Transport{

    public Bike(){
        System.out.println("In constructor :"+getClass().getSimpleName());

    }
    @Override
    public String travell() {
        return "Love to ride bike";
    }

}
