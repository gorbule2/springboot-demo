package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    //automatically created implementation
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Happy Hour for You! Congrats!";
    }


}
