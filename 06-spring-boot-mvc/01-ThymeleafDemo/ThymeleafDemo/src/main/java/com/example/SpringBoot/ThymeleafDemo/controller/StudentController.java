package com.example.SpringBoot.ThymeleafDemo.controller;

import com.example.SpringBoot.ThymeleafDemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${PLanguage}")
    private List<String>PLanguage;

    @Value("${Systems}")
    private List<String>Systems;

    @GetMapping("/showStudentForm")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("PLanguage", PLanguage);
        model.addAttribute("Systems", Systems);

        return "studentForm";

    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName());
        return "Student-confirmation";
    }
}
