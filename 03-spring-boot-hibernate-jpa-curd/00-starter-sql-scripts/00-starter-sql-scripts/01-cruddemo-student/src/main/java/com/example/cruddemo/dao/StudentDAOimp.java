package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOimp implements StudentDAO {
    private EntityManager em;
    @Autowired
    public StudentDAOimp(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void save(Student student) {
        em.persist(student);
    }

    @Override
    public Student findById(int id) {
        return em.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        //create Query
        TypedQuery<Student> query = em.createQuery("FROM Student order by FisrtName", Student.class);
        //return    query results
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = em.createQuery("FROM Student where LastName=:thedata", Student.class);
        query.setParameter("thedata", lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void Update(Student student) {
        em.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
       Student student = em.find(Student.class, id);
       em.remove(student);
    }

    @Override
    @Transactional
    public void ALLdelete() {
        int count = em.createQuery("DELETE FROM Student").executeUpdate();
        System.out.println("number of student deleted: " + count );
    }
}
