package com.luv2code.springcoredemo.rest;

import com.luv2code.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* To use like a Rest Controller we need that annotation
* */
@RestController
public class DemoController
{
    // Define a private field for the dependency
    private Coach myCoach;

    /*
    * Define the constructor to make the
    * dependency injection
    *
    * At this moment, we defined only one component
    * to be injected that is CricketCoach, so we use
    * the Coach interface and then the @Autowired will
    * look for the Component that matches with the
    * type Coach, in this case CricketCoach class.
     * */
    @Autowired // -> This annotation tells spring to inject a dependency
    public DemoController(Coach myCoach)
    {
        this.myCoach = myCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout ()
    {
        return this.myCoach.getDailyWorkout();
    }

}
