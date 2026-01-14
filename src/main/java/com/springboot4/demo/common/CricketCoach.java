package com.springboot4.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void startUp() {
        System.out.println("In startUp: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("In shutdown: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!! :)";
    }

}
