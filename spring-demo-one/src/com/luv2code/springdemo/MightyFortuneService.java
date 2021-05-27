package com.luv2code.springdemo;

import java.util.Random;

public class MightyFortuneService implements FortuneService {
	
	String[] fortunes = new String [3];
	
	public MightyFortuneService() {		
		fortunes[0] = "You have won the lottery";
		fortunes[1] = "You have won the Jackpot";
		fortunes[2] = "You have won a Million Euros";
		}


	@Override
	public String getFortune() {
		
		// create instance of Random class
		Random rand = new Random();
		
		// generate random integer in range from 0 to 2;
		int rand_int = rand.nextInt(3);
		
		// return random fortune
		return fortunes[rand_int];
	}

}
