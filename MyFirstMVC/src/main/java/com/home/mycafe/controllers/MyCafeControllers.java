package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	@RequestMapping("/cafe")
	public String showWelcomePage(Model model)
	{
		//Sending date to view(jsp page)
		model.addAttribute("myWebsiteTitle", "Mom's Cafe");
		return "welcome";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(Model model,HttpServletRequest request)
	{
		//handle data received from the user
		model.addAttribute("order", request.getParameter("foodType"));
		return "process-order";
	}
}
