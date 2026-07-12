package com.example3.SpringCoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TinnisCoach implements Coach {
    public TinnisCoach() {
        System.out.println("in constructor: "+this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand";
    }
}
