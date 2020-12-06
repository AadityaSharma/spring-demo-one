package com.aaditya.learn.springdemo;

import com.aaditya.learn.springdemo.services.Coach;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return "Volleyball is the next fortune";
    }
}
