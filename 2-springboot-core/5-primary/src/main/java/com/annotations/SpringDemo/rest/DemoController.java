package com.annotations.SpringDemo.rest;

import com.annotations.SpringDemo.common.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Transport transport;


 @Autowired
    public DemoController(Transport myTransport) {

       this.transport = myTransport;

    }

//    @Autowired
//    public void moments(Transport mytransport) {
//        transport=mytransport;
//    }
    @GetMapping("/travelling")
    public String travell(){
        return transport.travell();
    }
}
