package com.sprinboot.cruddemo.rest;

import com.sprinboot.cruddemo.dao.EmployeeDAO;
import com.sprinboot.cruddemo.entity.Employee;
import com.sprinboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService= theEmployeeService;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return  employeeService.findAll();
    }


}
