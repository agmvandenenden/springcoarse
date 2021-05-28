package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	
	public TrackCoach () {
		
	}
		
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a Fortune
		return "Just Do iT: "+ fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff () {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupEndStuffYoYo () {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}
