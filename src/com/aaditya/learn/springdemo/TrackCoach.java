package com.aaditya.learn.springdemo;

import com.aaditya.learn.springdemo.services.Coach;
import com.aaditya.learn.springdemo.services.FortuneService;
import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

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

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("Started up TrackCoach bean");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("Cleaned up TrackCoach bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside destroymethod");
    }
}
