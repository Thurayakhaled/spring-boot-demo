package com.project.springBoot.curddemo.DAO;

import com.project.springBoot.curddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
