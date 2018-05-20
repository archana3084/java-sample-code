package com.udemy.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create  an array of strings 
	private String[] data = {
			"beware !!",
			"Happy day!!",
			"Be cool !!"
	};
	// create a random number
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick random string
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
