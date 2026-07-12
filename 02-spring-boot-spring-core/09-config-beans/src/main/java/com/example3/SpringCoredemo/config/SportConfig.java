package com.example3.SpringCoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example3.SpringCoredemo.common.Coach;
import com.example3.SpringCoredemo.common.SwinCoach;
@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwinCoach();
    }
}
