package com.annotations.SpringDemo.rest;

import com.annotations.SpringDemo.common.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Transport transport;


 @Autowired
    public DemoController(Transport myTransport) {

       this.transport = myTransport;

    }
    @GetMapping("/travelling")
    public String travell(){
        return transport.travell();
    }
}
