package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

/*
* +---------------------+
* | SET BEAN AS DEFAULT |
* +---------------------+
*
* If we have ambiguity in ours injections, and
* we are not using @Qualifiers at all, we must
* define the primary component, so in this way
* Spring will know what dependency take.
* */
@Primary
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Run hard 5k";
    }
}
