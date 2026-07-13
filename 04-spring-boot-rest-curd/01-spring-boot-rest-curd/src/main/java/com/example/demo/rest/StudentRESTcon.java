package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRESTcon {
    private List<Student> students = new ArrayList<>();
    @PostConstruct
    public void init() {
        students.add(new Student("thoraya","khaled"));
        students.add(new Student("mariam","mohamed"));
        students.add(new Student("noor","eldien"));
    }
@RequestMapping("/students")
    public List<Student> getStudents() {

    return students;
}
@GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId) {
        if(studentId>students.size()||studentId<0){
            throw new StudentNotFound("Student not found: "+studentId);
        }
        return students.get(studentId);

    }



}

