package com.example3.SpringCoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseCoach implements Coach{
    BaseCoach(){
        System.out.println("in constructor: "+this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spent 30 min ";
    }
}
