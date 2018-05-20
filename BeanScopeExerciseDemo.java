package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExerciseDemo {

	public static void main(String[] args) {
		//load spring config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopeExercise-applicationContext.xml");
		
		//retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				Coach alphaCoach = context.getBean("myCoach", Coach.class);				
				boolean result = (theCoach == alphaCoach);
				
				System.out.println(":Pointing to same object: " + result);
				System.out.println("theCoach points to : " + theCoach);
				System.out.println("alphaCoach points to: " + alphaCoach);
		
	}

}
