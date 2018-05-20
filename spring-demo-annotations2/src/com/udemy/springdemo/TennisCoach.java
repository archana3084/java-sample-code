package com.udemy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis coach inside default constructor");
	}
	
	//define a setter method
	
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> Tennis coach inside setter method");
		fortuneService = theFortuneService;
	}
	*/
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
