package com.spring.spring_common_annotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("I am your science teacher my name is Sunil");
	}

}
