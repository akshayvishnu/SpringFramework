package com.spring.spring_value_required_annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String name;
	private String interestedCourse;
	private String hobby;
	
	public String getName() {
		return name;
	}
	@Value("Akshay")
	public void setName(String name) {
		this.name = name;
		System.out.println("setName setter method is getting invoked to set the name");
	}
	public String getInterestedCourse() {
		return interestedCourse;
	}
	@Required
	@Value("Java")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
		System.out.println("setInterestedCourse setter method is getting invoked to set the interested course");
	}
	public String getHobby() {
		return hobby;
	}
	@Value("Cricket")
	public void setHobby(String hobby) {
		this.hobby = hobby;
		System.out.println("setHobby setter method is getting invoked to set the Hobby.");
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Name: "+name+" Interested Course: "+interestedCourse+" Hobby: "+hobby);
	}

}
