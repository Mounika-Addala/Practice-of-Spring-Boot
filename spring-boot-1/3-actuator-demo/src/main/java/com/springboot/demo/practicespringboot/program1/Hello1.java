package com.springboot.demo.practicespringboot.program1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello1 {

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello Mouni";
    }

    @GetMapping("/work")
    public String dailyWork(){
        return "work for 8 hours";
    }

}
