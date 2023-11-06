package com.springboot.demo.practicespringboot.program1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hello1 {

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello Mouni";
    }


}
