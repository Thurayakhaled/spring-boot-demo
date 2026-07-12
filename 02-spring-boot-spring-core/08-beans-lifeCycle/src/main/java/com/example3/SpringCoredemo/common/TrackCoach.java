package com.example3.SpringCoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jdk.jfr.Percentage;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
@Component

    public class TrackCoach implements Coach {
        public TrackCoach() {System.out.println("in constructor: " + this.getClass().getSimpleName());}

        @Override
        public String getDailyWorkout() {
            return "Run hard 5k!";
        }

        //init method
    @PostConstruct
    public void postConstruct() {
            System.out.println("in postConstruct: " + this.getClass().getSimpleName());
    }
    //destroy method
    @PreDestroy
    public void preDestroy() {
            System.out.println("in preDestroy: " + this.getClass().getSimpleName());
    }
    }
