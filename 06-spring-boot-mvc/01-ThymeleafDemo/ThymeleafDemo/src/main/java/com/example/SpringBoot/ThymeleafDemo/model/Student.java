package com.example.SpringBoot.ThymeleafDemo.model;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favLanguage;
    private List<String> favSystem;
    public Student(){

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public Student(String firstName, String lastName, String country, String favLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favLanguage = favLanguage;
    }

    public Student(String firstName, String lastName, String country, String favLanguage, List<String> favSystem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favLanguage = favLanguage;
        this.favSystem = favSystem;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    public List<String> getFavSystem() {
        return favSystem;
    }

    public void setFavSystem(List<String> favSystem) {
        this.favSystem = favSystem;
    }
}
