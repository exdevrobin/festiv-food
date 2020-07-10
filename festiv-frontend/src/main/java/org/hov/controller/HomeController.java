package org.hov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
	@GetMapping(value= {"","/","home","index"})
	public String home()
	{
		return "home";
	}
	
	@GetMapping(value="about")
	public String about()
	{
		return "about";
	}
	
	@GetMapping(value="contact")
	public String contact()
	{
		return "contact";
	}
}
