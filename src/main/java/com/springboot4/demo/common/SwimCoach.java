package com.springboot4.demo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up";
    }

}
