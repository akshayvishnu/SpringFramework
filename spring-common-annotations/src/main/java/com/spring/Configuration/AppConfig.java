package com.spring.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.spring_common_annotations.College;
import com.spring.spring_common_annotations.MathTeacher;
import com.spring.spring_common_annotations.Principal;
import com.spring.spring_common_annotations.Teacher;

@Configuration
@ComponentScan(basePackages= {"com.spring.spring_common_annotations"})
@PropertySource("classpath:college-info.properties")
public class AppConfig {
	
	/*
	@Bean
	public Principal getPrincipal()
	{
		return new Principal();
	}
	
	@Bean({"collegeBean","colBean"})
	public College getCollege()
	{
		College college=new College();
		college.setPrincipal(getPrincipal());
		college.setTeacher(getMathTeacher());
		return college;
	}
	
	@Bean
	public Teacher getMathTeacher()
	{
		return new MathTeacher();
	}
	*/
}
