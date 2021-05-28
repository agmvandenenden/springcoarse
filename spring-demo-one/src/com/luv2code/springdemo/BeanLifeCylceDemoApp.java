package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCylceDemoApp {

public static void main(String[] args) {
		
		// load the spring configuration file 
		ClassPathXmlApplicationContext context =
						new ClassPathXmlApplicationContext ("beanLifeCycle-applicationContext.xml");
						
		// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same (check their object reference!)
		boolean result = theCoach == alphaCoach;
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close the context
		context.close();

	}

}
