package com.springboot4.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice batting for 30 minutes!! :)";
    }


}
