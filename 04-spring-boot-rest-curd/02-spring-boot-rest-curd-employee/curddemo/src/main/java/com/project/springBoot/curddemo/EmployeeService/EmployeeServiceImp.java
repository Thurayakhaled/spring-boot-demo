package com.project.springBoot.curddemo.EmployeeService;

import com.project.springBoot.curddemo.dao.EmpDAO;
import com.project.springBoot.curddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeServices{
    private EmpDAO empDAO;
    @Autowired
    public EmployeeServiceImp(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }
    @Override
    public List<Employee> findAll() {
        return empDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return empDAO.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return empDAO.save(employee);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        empDAO.delete(id);

    }
}
