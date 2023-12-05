package com.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class DemoController {

	//create a mapping for /hello
	@GetMapping("/hello")
	public String sayHello(Model theModel) {
		//Thymeleaf accesses "theDate" from the Spring MVC Model
		theModel.addAttribute("theDate", new java.util.Date());
		
		return "helloWorld"; //return the name of the html file 
	}
	
}
