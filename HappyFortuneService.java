package com.udemy.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is very lucky day!";
	}

}
