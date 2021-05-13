package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j)
	{
		ModelAndView mv = new ModelAndView();
		int k = i+j;
		mv.addObject("result",k);
		mv.setViewName("result.jsp");
		return mv;
	}

}
