package com.example.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Alien;
import com.example.demo.dao.AlienRepo;

@RestController
public class AppController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aId)
	{
		ModelAndView mv = new ModelAndView();
		Alien alien = repo.findById(aId).orElse(new Alien());
		
		//Fetching data by Technology
		System.out.println(repo.findByTech("Java"));
		
		//Fetching all the aliens with id greater than 102
		System.out.println(repo.findByaIdGreaterThan(102));
		
		//Find all the alien by Technology and sort the result set by aName
		System.out.println(repo.findByTechSorted("Java"));
		
		mv.addObject("alien", alien);
		mv.setViewName("showAlien");
		return mv;
	}
	
	@RequestMapping(path="/aliens",produces= {"application/json","application/xml"},method=RequestMethod.GET)
	@ResponseBody
	public List<Alien> getAliens()
	{
		//Data is a normal string
		//return repo.findAll().toString();
		
		//Will get the data in JSON format
		return repo.findAll();
	}
	
	@RequestMapping(path="/alien/{aId}",produces= {"application/xml"},method=RequestMethod.GET)
	@ResponseBody
	public Optional<Alien> getalien(@PathVariable("aId") int Id)
	{
		//return repo.findById(Id).toString();
		return repo.findById(Id);
	}
	
	
	@PostMapping(path="/alien",produces={"application/json","application/xml"},consumes= {"application/xml"})
	//@ResponseBody
	public Alien createAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@RequestMapping(path="/alien/{aId}",method=RequestMethod.DELETE)
	public String deleteAlien(@PathVariable("aId") int aId)
	{
		Alien alien = repo.findById(aId).orElse(new Alien());
		repo.delete(alien);
		return "Deleted";
	}

	@RequestMapping(path="/alien",method=RequestMethod.PUT,produces= {"application/xml","application/json"})
	public Alien updateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
}
