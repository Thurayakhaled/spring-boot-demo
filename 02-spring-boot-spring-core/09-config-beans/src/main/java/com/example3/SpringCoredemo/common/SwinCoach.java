package com.example3.SpringCoredemo.common;

public class SwinCoach implements Coach{
    public SwinCoach(){
        System.out.println("SwinCoach");
    }
    @Override
    public String getDailyWorkout() {
        return "swim 1000m ";
    }
}
