package com.spring.spring_common_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	@Value("${collegeName}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	/*public College(Principal principal) {
		super();
		this.principal = principal;
	}*/
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getCollegeName() {
		return collegeName;
	}
	@Required
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void Test()
	{
		System.out.println("My college name is: "+collegeName);
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing Successful.");
	}

}
