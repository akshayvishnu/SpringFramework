package com.spring.SpringIOC;

import com.spring.IOC.Sim;

/**
 * Hello world!
 *
 */
public class Airtel implements Sim
{

	public void Calling() {
		System.out.println("Calling using Airtel sim");
	}

	public void data() {
		System.out.println("Browsing internet using airtel sim");
	}
    
}
