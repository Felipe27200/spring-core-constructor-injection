package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* Make it a customize bean
* */
@Configuration
public class SportConfig
{
    /*
    * This bean will return an instance
    * of SwimCoach and make it available
    * to use inside the Spring project.
    *
    * The id of the bean is for default
    * the name of the method, so it's
    * swimCoach
    * */
    // @Bean("aquatic") -> Give a custom name to the bean
    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
