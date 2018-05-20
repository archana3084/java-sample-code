package com.udemy.springdemo;

public class BaseBallCoach implements Coach{
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Do 100 burpees";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
		
	}
	
}
