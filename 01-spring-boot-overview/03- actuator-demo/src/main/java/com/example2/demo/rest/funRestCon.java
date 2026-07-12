package com.example2.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestCon {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/workout")
    public String workout() {
        return "run a hard 5k!";
    }
    @GetMapping("/fortune")
    public String fortune() {
        return "today is your lucky day!";
    }
}
