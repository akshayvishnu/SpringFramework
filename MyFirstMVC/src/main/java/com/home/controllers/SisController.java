package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sister")
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupKit()
	{
		return "Take my makeup kit";
	}
	
	@ResponseBody
	@RequestMapping("/books")
	public String getBooks()
	{
		return "Maths Book";
	}

}
