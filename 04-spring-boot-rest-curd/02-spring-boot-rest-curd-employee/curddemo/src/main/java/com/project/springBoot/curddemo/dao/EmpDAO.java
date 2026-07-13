package com.project.springBoot.curddemo.dao;

import com.project.springBoot.curddemo.entity.Employee;

import java.util.List;

public interface EmpDAO {
    List<Employee> findAll();
}
