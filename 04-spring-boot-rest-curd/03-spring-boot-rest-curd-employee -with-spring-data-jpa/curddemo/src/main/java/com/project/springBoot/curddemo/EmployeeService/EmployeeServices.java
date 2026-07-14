package com.project.springBoot.curddemo.EmployeeService;

import com.project.springBoot.curddemo.entity.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void delete(Integer id);
}
