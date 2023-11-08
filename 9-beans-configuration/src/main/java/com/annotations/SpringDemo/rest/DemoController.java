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

 @Autowired
    public DemoController(@Qualifier("ride") Transport myTransport) {
        System.out.println("In Constructors :" + getClass().getSimpleName());
        this.transport = myTransport;
 }
 @GetMapping("/travelling")
      public String travell()   {
             return transport.travell();
       }


}
