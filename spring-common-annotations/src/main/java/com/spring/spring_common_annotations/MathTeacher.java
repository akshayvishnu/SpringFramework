package com.spring.spring_common_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	public void teach() {
		
		System.out.println("Hi I am your maths teacher My name is Akshay.");
	}

}
