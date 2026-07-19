package com.example.SpringBoot.ThymeleafDemo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloworld";
    }

}
