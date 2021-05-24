package com.luv2code.springdemo;

public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 60 minutes practicing you back hand volley";
	}
}