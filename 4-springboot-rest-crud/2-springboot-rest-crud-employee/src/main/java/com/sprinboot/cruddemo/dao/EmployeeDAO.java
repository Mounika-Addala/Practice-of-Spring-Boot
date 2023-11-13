package com.sprinboot.cruddemo.dao;

import com.sprinboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
