package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practice";
    }

}
