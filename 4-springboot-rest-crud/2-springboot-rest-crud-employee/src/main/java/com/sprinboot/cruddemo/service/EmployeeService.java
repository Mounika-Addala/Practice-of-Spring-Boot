package com.sprinboot.cruddemo.service;

import com.sprinboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
