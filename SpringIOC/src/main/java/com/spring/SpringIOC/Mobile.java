package com.spring.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.IOC.Sim;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Sim sim = (Sim) context.getBean("airtel");
		sim.Calling();
		
		Vodafone voda = context.getBean("vodafone",Vodafone.class);
		voda.Calling();
	}

}
