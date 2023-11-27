package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
         employeeService=theEmployeeService;
    }


    @GetMapping("/list")
    public String listEmployee(Model model){
        List<Employee> theEmployee=employeeService.findAll();
        model.addAttribute("employees",theEmployee);
        return "employees/list-employee";
    }
    @GetMapping("/showFormForAdd")
    public String showForm(Model model){
        Employee theEmployee=new Employee();
        model.addAttribute("employee",theEmployee);
        return "employees/employee-form";
    }
    @GetMapping("/showFormForUpdate")
    public  String showFormForUpdate(@RequestParam("employeeId") int id,Model model){

        Employee theEmployee=employeeService.findById(id);
        model.addAttribute("employee",theEmployee);
        return "employees/employee-form";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int id,Model Model){
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }

}
