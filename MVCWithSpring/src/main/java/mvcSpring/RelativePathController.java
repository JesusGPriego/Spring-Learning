package mvcSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * This controller declares the same route as one in FormController.
 * It will be necessary to handle this situation so the program doesn't break.
 * 
 * To solve this issue, it is necessary to add another @RequestMapping annotation to the controller:
 * 
 */

@Controller
@RequestMapping("/ambiguous")
public class RelativePathController {

	
	@RequestMapping("/formResponseWithRequest")
	//public String formResponseWithRequest(HttpServletRequest request, Model model) 
	public String formResponseWithRequest(@RequestParam("name")String param, Model model){
		

		
		
		String finalMessage = "This line is added in the ambiguous controller \n Hi " 
				 + param;
		
		//Adding info to the model:
		//It is necessary to give an identifier to the attribute, and the info itself.
		model.addAttribute("identifier", finalMessage);
		//This is te .jsp file that the method returns.
		return "HandledForm";
	}
	
}
