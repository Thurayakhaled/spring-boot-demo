package com.project.springBoot.curddemo.dao;

import com.project.springBoot.curddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class EmpDAOImp implements EmpDAO {
    private EntityManager entityManager;
    @Autowired
    public EmpDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {
        //create a query
        TypedQuery<Employee>q = entityManager.createQuery("select e from Employee e", Employee.class);

        //execute query and get result list
        List<Employee> employees = q.getResultList();
        //return the results
        return employees;
    }
}
