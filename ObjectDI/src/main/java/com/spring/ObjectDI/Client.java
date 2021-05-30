package com.spring.ObjectDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		/*Student student = new Student();
		student.cheating();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student stud = context.getBean("student",Student.class);
		stud.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherstudent", AnotherStudent.class);
		anotherStudent.startCheating();

	}

}
