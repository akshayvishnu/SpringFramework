package com.spring.SpringDI;

public class Student {
	
	private String name;
	private int Id;

	public Student(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public void displayStudentInfo()
	{
		System.out.println("Student name is: "+name+" and Id is: "+Id);
	}

}
