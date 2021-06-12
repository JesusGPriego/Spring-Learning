package mvcWithTags.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mvcWithTags.entities.Student;

/**
 * Basic student controller (No form validation)
 * @author Susej
 *
 */
@Controller 
@RequestMapping("/student")
public class StudentController {
	/*
	 * Saving an student in the model:
	 */
	@RequestMapping("/studentForm")
	public String showStudentForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "student/studentForm";
		
	}
	/*
	 * Request mapping tells Spring what method to be called. This method returns a web page.
	 */
	/*
	 * Recovering the object saved in the model using @ModelAttribute:
	 */
	@RequestMapping("/formHandler")
	public String formHandler(@ModelAttribute("student") Student student) {
		
		return "student/handledStudentForm";
		
	}
	
	
}
