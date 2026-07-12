package com.example3.SpringCoredemo.rest;

import com.example3.SpringCoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    @Autowired
    public DemoController( Coach coach) {
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getdailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
