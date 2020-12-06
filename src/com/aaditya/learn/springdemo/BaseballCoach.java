package com.aaditya.learn.springdemo;

import com.aaditya.learn.springdemo.services.Coach;
import com.aaditya.learn.springdemo.services.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
//        return fortuneService.getFortune();
        return "Spend 30 minutes on batting practice daily!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
