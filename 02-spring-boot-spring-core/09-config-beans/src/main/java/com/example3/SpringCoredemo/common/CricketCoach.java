package com.example3.SpringCoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {
public CricketCoach() {
    System.out.println("in constructor: "+this.getClass().getSimpleName());
}
    @Override
    public String getDailyWorkout() {
        return "practice fast bowling !!!!";
    }
}
