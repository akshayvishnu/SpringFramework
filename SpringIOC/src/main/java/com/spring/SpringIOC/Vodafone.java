package com.spring.SpringIOC;

import com.spring.IOC.Sim;

public class Vodafone implements Sim{

	public void Calling() {
		System.out.println("Calling using Vodafone sim");
	}

	public void data() {
		System.out.println("Browsing internet using vodafone sim");
	}

}
