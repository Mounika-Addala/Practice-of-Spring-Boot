package com.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/mouni")
    public String hello(Model model){


        model.addAttribute("theDate",new java.util.Date());

        return "heeloworld";
    }

}
