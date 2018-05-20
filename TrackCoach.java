package com.udemy.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard 5K";
	}

	@Override
	public String getDailyFortune() {
				return "Just Do It" + fortuneService.getFortune();
	}

	
	//add init method
	public void doMyStartupStuff()
	{
		System.out.println("trackCoach: inside method doMyStartupStuff");
	}
	
	//add destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("trackCoach: inside method doMyCleanupStuff");
	}
	
}
