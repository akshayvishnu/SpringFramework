package com.Maven.Practical;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void Drive()
	{
		System.out.println("Baagh Rahe hai...");
	}

}
