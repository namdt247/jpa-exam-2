package com.example.jpaexam.controller;

import com.example.jpaexam.entity.Employee;
import com.example.jpaexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Employee> getList() {
        return employeeService.list();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Boolean createEmployee(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }
}
