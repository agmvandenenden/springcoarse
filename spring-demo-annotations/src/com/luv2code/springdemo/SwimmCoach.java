package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimmCoach implements Coach {
	
	private FortuneService fortuneService;	
	
	@Autowired
	public SwimmCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swiim 20 laps in the 25 m swimming pool";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
