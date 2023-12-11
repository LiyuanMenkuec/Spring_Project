package com.mvc.thymeleaf.controller;

import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;




@Controller
public class HelloWorldController {
	
	// need a controller method to show initial HTML form
	
	@GetMapping("/showForm")
	public String showForm() {
		
		return "helloWorld-form";
		
	}
	
	// need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloWorld";
	}
	
	
	
	// need a controller method to read form data and add data to the model, binds data in the html
	@RequestMapping("/processFormTwo")
	public String processFormTwo(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML form
		String theName=request.getParameter("studentName");
		//change the name
		theName="Cool!"+theName;
		//create a message for html page
		String message="Wellcome "+theName + " ";
		//add message to the Model
		model.addAttribute("message", message);
		
		return "helloWorld";
		}
	
		// need a controller method: assign Variable theName to value of request parameter
		@PostMapping("/processFormThree")
		public String processFormThree(@RequestParam("studentName") String theName, Model model) {
		
		theName="Cool!"+theName;
		//create a message for html page
		String message="Wellcome"+theName;
		//add message to the Model
		model.addAttribute("message", message);
			
			return "helloWorld";
			}

}
