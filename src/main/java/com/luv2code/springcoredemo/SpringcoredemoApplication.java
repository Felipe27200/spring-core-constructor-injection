package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* The Util package isn't inside the default package ('springcoredemo')
* so we must define explicitly the package structure for
* our Spring Application
* */
@SpringBootApplication(
	// We have to declare this field to
	// list our packages and make them
	// available for the Spring project.
	scanBasePackages = {
		"com.luv2code.springcoredemo",
		"com.luv2code.util"
	}
)
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
