package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        theEmployeeService=employeeService;
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Employee> theEmployee=employeeService.findAll();
        model.addAttribute("employees",theEmployee);
        return  "list-employee";
    }

}
