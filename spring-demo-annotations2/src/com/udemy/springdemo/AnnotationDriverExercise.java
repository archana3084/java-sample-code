package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDriverExercise {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("cricketCoach", Coach.class);
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close context	
		context.close();
		
		
		}

}
