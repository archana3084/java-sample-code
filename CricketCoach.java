package com.udemy.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//add new fields for emailaddress and team
	private String emailAddress;
	private String team;

	//create no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowlinf 20 min";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside seter method - setEmailAddress");
		
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: inside seter method - setTeam");
		this.team = team;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside seter method");
		this.fortuneService = fortuneService;
	}
	
	
	

}
