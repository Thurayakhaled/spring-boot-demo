package com.project.springBoot.curddemo.rest;

import com.project.springBoot.curddemo.dao.EmpDAO;
import com.project.springBoot.curddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestCon {
    private EmpDAO empDAO;
    public EmployeeRestCon(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    @GetMapping("/emp")
    public List<Employee> getEmployees() {
        return empDAO.findAll();
    }


}
