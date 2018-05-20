package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call new method for fortune service
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	
	}

}
