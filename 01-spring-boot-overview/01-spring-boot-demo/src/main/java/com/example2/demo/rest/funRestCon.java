package com.example2.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestCon {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
