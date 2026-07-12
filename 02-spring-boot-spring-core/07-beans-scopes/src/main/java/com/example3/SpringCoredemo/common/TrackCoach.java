package com.example3.SpringCoredemo.common;

import jdk.jfr.Percentage;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public class TrackCoach implements Coach {
        public TrackCoach() {System.out.println("in constructor: " + this.getClass().getSimpleName());}

        @Override
        public String getDailyWorkout() {
            return "Run hard 5k!";
        }
    }
