package com.crud.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("click")
public class DemoRestController {
    @GetMapping("/hii")
            public String hello()
            {
                return "hii Mouni....";
            }
}
