package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	
	/*@RequestMapping("/home")
	//@ResponseBody
	public String home(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Hi");
		System.out.println(name);
		session.setAttribute("name", name);
		return "home";
	}*/
	
	/*@RequestMapping("/home")
	//@ResponseBody
	public ModelAndView home(@RequestParam("name") String myName,HttpSession session)
	{
		System.out.println("Hi");
		System.out.println(myName);
		//session.setAttribute("name", myName);
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
	}*/
	
	@RequestMapping("/home")
	//@ResponseBody
	public ModelAndView home(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		System.out.println(alien.getaId());
		System.out.println(alien.getaName());
		System.out.println(alien.getLang());
		return mv;
	}
	

}
