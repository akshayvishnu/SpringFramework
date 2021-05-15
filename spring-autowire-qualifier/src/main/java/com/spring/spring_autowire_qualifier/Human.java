package com.spring.spring_autowire_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart heart;

	@Autowired
	public Human(@Qualifier("humanHeart") Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter methode invoked");
	}
	
	public void startPumping()
	{
		heart.pump();
	}

}
