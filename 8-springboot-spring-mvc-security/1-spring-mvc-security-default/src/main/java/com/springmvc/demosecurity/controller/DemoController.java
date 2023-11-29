package com.springmvc.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
    @GetMapping("/")
    public String homePage(){
        return "home";
    }
    @GetMapping("/leaders")
    public String showLeader(){
        return "leaders";
    }
    @GetMapping("/system")
    public String showAdmin(){
        return "system";
    }
}
