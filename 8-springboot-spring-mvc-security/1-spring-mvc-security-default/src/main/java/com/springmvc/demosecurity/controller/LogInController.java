package com.springmvc.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {
    @GetMapping("/showMyLoginPage")
    public String login(){
        return "plain-login";
    }
}
