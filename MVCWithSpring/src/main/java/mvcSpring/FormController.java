 package mvcSpring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class FormController {

	
	
	
	/*
	 * Provides the form.
	 */
	@RequestMapping("/basicForm")
	public String basicForm() {
		return "ExampleForm";
	}
	/*
	 * Basic handler for the form.
	 */
	@RequestMapping("/formResponse")
	public String formResponse() {
		return "HandledForm";
	}
	/*
	 * This method manipulates the information that the user send in the form.
	 */
	@RequestMapping("/formResponseWithRequest")
	//public String formResponseWithRequest(HttpServletRequest request, Model model) 
	public String formResponseWithRequest(@RequestParam("name")String param, Model model){
		

		
		
		String finalMessage = "This line is added in the controller\nHi " 
				 + param;
		
		//Adding info to the model:
		//It is necessary to give an identifier to the attribute, and the info itself.
		model.addAttribute("identifier", finalMessage);
		//This is te .jsp file that the method returns.
		return "HandledForm";
	}
	
	
}
