package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

/*
* This annotation marks the class as a Spring Bean
* make it available to dependency injection.
* */
@Component
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes";
    }
}
