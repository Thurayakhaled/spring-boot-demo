package com.example3.SpringCoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spent 30 min ";
    }
}
