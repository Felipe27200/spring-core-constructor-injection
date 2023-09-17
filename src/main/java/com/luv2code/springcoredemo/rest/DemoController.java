package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* To use this like a Rest Controller we need that annotation
* */
@RestController
public class DemoController
{
    // Define a private field for the dependency
    private Coach myCoach;

    /*
     * Thanks, the @Autowired annotation the dependency
     * will be injected automatically when we run the project.
     * */
    @Autowired // -> This annotation tells spring to inject a dependency

    /*
    * Must use @Qualifier to indicate which bean(dependency)
    * Spring has to use
    * */
    // public DemoController(@Qualifier("baseballCoach") Coach myCoach)
    public DemoController(@Qualifier("trackCoach") Coach myCoach)
    {
        this.myCoach = myCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout ()
    {
        return this.myCoach.getDailyWorkout();
    }

}
