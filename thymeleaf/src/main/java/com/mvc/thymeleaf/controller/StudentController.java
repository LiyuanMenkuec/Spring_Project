package com.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.thymeleaf.model.Student;



@Controller
public class StudentController {

	@GetMapping("/showStudentForm")
	public String showForm(Model theModel) {
		
		//create a new student object
		Student theStudent = new Student();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@PostMapping("/processStudentForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println(theStudent.getFirstName() + "  " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}
