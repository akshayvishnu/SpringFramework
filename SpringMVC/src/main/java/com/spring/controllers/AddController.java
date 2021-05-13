package com.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		//System.out.println("Inside method to add two numbers");
		ModelAndView mv = new ModelAndView();
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		//int k = i + j;
		AddService as = new AddService();
		int k = as.add(i, j);
		mv.addObject("request",k);
		mv.setViewName("display.jsp");
		return mv;
	}

}
