package com.project.springBoot.curddemo.dao;

import com.project.springBoot.curddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
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

    @Override
    public Employee findById(Integer id) {
//        TypedQuery<Employee>q = entityManager.createQuery("select e from Employee e WHERE id=:thedata", Employee.class);
//        q.setParameter("thedata", id);
//        Employee emp= q.getSingleResult();
//        return emp;

        Employee employee = entityManager.find(Employee.class, id);
        return employee;


    }

    @Override
    // no mention to   @Transactional
    public Employee save(Employee employee) {
        Employee emp = entityManager.merge(employee); //if the id==0 ->save
        // else update
        return emp;

    }



    @Override
    public void delete(Integer id) {
        Employee emp=findById(id);
        if(emp!=null) {
            entityManager.remove(emp);
        }
        else
            throw new RuntimeException("Employee not found");


    }
}
