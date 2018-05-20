package com.udemy.springdemo;

import java.lang.reflect.Array;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
private String[] fortuneArray =  {"Fentastic day!!","Lucky day!!", "Happy day!!"};
	@Override
	public String getFortune() {
		
		//pick a random fortune from fortuneArray and return it.
		int rand = new Random().nextInt(fortuneArray.length);
		return fortuneArray[rand];
	}
	

}
