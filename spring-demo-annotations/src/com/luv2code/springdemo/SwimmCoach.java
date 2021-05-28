package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimmCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swiim 20 laps in the 25 m swimming pool";
	}

}
