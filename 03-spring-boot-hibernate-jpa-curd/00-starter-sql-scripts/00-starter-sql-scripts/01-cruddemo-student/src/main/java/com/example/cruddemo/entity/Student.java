package com.example.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private int id;
    @Column(name="first_name")
    private String FisrtName;
    @Column(name="last_name")
    private String LastName;
    @Column(name="email")
    private String email;


    //define constructors
    public Student() {

    }

    public Student(String firstName, String lastName, String email) {
        FisrtName = firstName;
        LastName = lastName;
        this.email = email;
    }
//define getters/setters

    public void setId(int id) {
        this.id = id;
    }

    public void setFisrtName(String fisrtName) {
        FisrtName = fisrtName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFisrtName() {
        return FisrtName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return email;
    }
//define toString


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FisrtName='" + FisrtName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
