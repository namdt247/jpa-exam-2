package com.example.jpaexam.service;

import com.example.jpaexam.entity.Employee;
import com.example.jpaexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

@Service
@Configurable
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Boolean create(Employee employee) {
        try {
            employeeRepository.save(employee);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Iterable<Employee> list() {
        return employeeRepository.findAll();
    }
}
