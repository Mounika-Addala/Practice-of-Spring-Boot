package com.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworldform";
    }
     @RequestMapping("/processForm")
     public String processForm() {
         return "heeloworld";
        }

        @RequestMapping("/processForm2")
    public String learning(HttpServletRequest request, Model model) {

        String name=request.getParameter("studentName");
        name=name.toUpperCase();
        String result ="WOW" +name;
        model.addAttribute("message",result);
        return "heeloworld";
        }

    @PostMapping("/processForm3")
    public String practicing(@RequestParam("studentName") String name, Model model) {
        name=name.toUpperCase();
        String result ="What a surprise my friend  " +name;
        model.addAttribute("message",result);
        return "heeloworld";
    }


}
