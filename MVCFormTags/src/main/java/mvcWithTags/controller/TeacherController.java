package mvcWithTags.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import mvcWithTags.entities.Teacher;

/**
 * Basic student controller (Form validation enabled).
 * @author SuleWare
 *
 */



/*
 * Steps for validation:
 * 
 * 	1. Add hibernate libraries to the project.
 *  2. Specify fields to validate.
 *  3. Specify validation in controller.
 *  4. Specify error message in form
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	/*
	 * Saving an student in the model:
	 */
	@RequestMapping("/teacherForm")
	public String showStudentForm(Model model) {
		
		Teacher teacher = new Teacher();
		
		model.addAttribute("teacher", teacher);
		
		return "teacher/teacherForm";
		
	}

	
	/*
	 * Validation in controller adding @Valid annotation and BindingResult 
	 */
	@RequestMapping("/formHandler")
	public String formHandler(@Valid @ModelAttribute("teacher") Teacher teacher, BindingResult validationResult) {

		if(validationResult.hasErrors()) {
			return "teacher/teacherForm";
		}else {
			return "teacher/handledTeacherForm";
		}
	}
	
	/*
	 * No white spaces "name" is allowed.
	 * @InitBinder is executed before the petition is processed.
	 */
	@InitBinder
	public void binder(WebDataBinder binder) {
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, editor);
		
	}
	
	
	
}
