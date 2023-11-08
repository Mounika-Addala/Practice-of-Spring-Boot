package com.annotations.SpringDemo.rest;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.annotations.SpringDemo.common.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Transport transport;
    private Transport anotherTransport;


 @Autowired
    public DemoController(@Qualifier("train") Transport myTransport,
                          @Qualifier("train") Transport myAnotherTransport) {
     System.out.println("In Constructors :" + getClass().getSimpleName());
       this.transport = myTransport;
       this.anotherTransport=myAnotherTransport;

    }

//    @Autowired
//    public void moments(Transport mytransport) {
//        transport=mytransport;
//    }
    @GetMapping("/travelling")
    public String travell(){
        return transport.travell();
    }

    @GetMapping("/check")
    public String check(){
     return "Comparing beans : transport == anotherTransport ," +(transport==anotherTransport);
    }
}
