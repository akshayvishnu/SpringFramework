package com.spring.SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*Student stud = context.getBean("student",Student.class);
		//stud.setName("Akshay");
		stud.displayStudentInfo();
		
		Student st = context.getBean("student2",Student.class);
		st.displayStudentInfo();*/
		
		Student stud3=context.getBean("student3",Student.class);
		stud3.displayStudentInfo();

	}

}
