package com.example.SpringBoot.ThymeleafDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    // initial HTML form
    @GetMapping("/showForm")
    public String helloWorld() {
        return "helloworld-form"; // html file name
    }

    //controller method for HTML
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";

    }

    @RequestMapping("/processFromVersionTwo")
    public String letshoutdude(HttpServletRequest request,Model model){
        String theName = request.getParameter("studentName");
      //  theName=theName.toUpperCase();
        String result ="Yo!" + theName;
        model.addAttribute("message", result);
        return "helloworld";
    }

    @GetMapping("/processFromVersionThree")
    public String processFromVersionThree(@RequestParam("studentName") String theName, Model model){

        theName=theName.toUpperCase();
        String result ="HI!" + theName;
        model.addAttribute("message", result);
        return "helloworld";
    }

}
