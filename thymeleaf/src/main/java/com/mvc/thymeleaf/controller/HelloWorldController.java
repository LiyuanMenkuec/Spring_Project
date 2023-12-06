package com.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {
	
	// need a controller method to show initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloWorld-form";
		
	}
	
	// need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloWorld";
	}
	

}