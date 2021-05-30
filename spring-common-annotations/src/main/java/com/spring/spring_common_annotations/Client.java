package com.spring.spring_common_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Configuration.AppConfig;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Configuration file has been loaded");
		College college= context.getBean("collegeBean",College.class);
		System.out.println("Object has been created.");
		college.Test();
		//(AnnotationConfigApplicationContext)context.close();
	}

}
