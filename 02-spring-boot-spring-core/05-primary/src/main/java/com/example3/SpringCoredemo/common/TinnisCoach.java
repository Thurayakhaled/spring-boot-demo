package com.example3.SpringCoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TinnisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand";
    }
}
