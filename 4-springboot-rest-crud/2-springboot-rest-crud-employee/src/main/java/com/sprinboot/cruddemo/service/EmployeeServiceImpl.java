package com.sprinboot.cruddemo.service;

import com.sprinboot.cruddemo.dao.EmployeeDAO;
import com.sprinboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO)
    {
        employeeDAO=theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return  employeeDAO.findAll();
    }
}
