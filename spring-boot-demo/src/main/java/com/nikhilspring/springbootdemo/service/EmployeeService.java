package com.nikhilspring.springbootdemo.service;

import com.nikhilspring.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

   Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
