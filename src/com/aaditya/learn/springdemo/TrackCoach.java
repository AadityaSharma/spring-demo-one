package com.aaditya.learn.springdemo;

import com.aaditya.learn.springdemo.services.Coach;
import com.aaditya.learn.springdemo.services.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() { }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return  "Ran a hard 5k with some good fortune!!!! " + fortuneService.getFortune();
    }
}
