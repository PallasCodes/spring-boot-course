package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

// the component annotation declares the class as a spring bean
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 minutes, now uwu";
    }
}

