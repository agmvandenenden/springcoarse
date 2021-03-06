package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	// define a default constructor
	public TennisCoach() {
//		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
//		System.out.println(">> TennisCoach: inside of doMyStartupStuff  ");		
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanStuff() {
//		System.out.println(">> TennisCoach: inside of doMyCleanStuff  ");		
	}
	
	
	// define setter method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
//		this.fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes practicing you backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	

}