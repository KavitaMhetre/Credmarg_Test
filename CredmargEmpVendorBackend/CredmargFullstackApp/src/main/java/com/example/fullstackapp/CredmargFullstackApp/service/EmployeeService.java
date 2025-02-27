package com.example.fullstackapp.CredmargFullstackApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fullstackapp.CredmargFullstackApp.model.Employee;
import com.example.fullstackapp.CredmargFullstackApp.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
