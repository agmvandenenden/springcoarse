package com.luv2code.springdemo;

public class TennisCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
			
	// define a constructor for dependency injection
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Spend 60 minutes practicing you back hand volley";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a Fortune
		return fortuneService.getFortune();
	}
}