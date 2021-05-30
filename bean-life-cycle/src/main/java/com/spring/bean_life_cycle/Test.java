package com.spring.bean_life_cycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentDAO dao = context.getBean("studentdao",StudentDAO.class);
		System.out.println("StudentDAO object created....");
		dao.selectStudents();
		//dao.deleteStudentRecord(3);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
