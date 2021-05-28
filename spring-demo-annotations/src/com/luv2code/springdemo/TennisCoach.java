package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes practicing you backhand volley";
	}

}