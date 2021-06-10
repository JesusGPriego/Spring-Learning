package allAnnotations;

import org.springframework.stereotype.Component;

/*
 * I call it commercial and did not let default name bc I wanted some sense in here.
 */
@Component("commercial")
public class ComponentAnnotation implements interfaces.Employee{

	@Override
	public String getTask() {
		// TODO Auto-generated method stub
		return "I can sell it all.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "This is a commercial's report";
	}

}
