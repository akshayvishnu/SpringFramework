package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@RequestMapping("/sugar")
	@ResponseBody
	public String giveSugar()
	{
		return "Your sugar is here";
	}

}
