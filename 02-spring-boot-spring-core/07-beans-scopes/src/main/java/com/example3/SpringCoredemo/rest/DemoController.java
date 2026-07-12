package com.example3.SpringCoredemo.rest;

import com.example3.SpringCoredemo.common.Coach;
import com.example3.SpringCoredemo.common.TrackCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    public Coach anotherCoach;
    @Autowired
    public DemoController(
            @Qualifier("trackCoach")Coach coach,
            @Qualifier("trackCoach")Coach theAnotherCoach){
        System.out.println("in constructor: "+this.getClass().getSimpleName());
        myCoach = coach;
        anotherCoach = theAnotherCoach;
    }
    @GetMapping("/check")
    public boolean check(){
        return (myCoach == anotherCoach);
    }

    @GetMapping("/dailyworkout")
    public String getdailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
