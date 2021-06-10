package allAnnotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import interfaces.Employee;

@Component("boss")
//Scope accepts 2 parameters: singleton | prototype
@Scope("singleton")
public class ScopeAnnotation implements Employee{

	@Override
	public String getTask() {
		// TODO Auto-generated method stub
		return "I do boss' tasks";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Boss report: ...";
	}

}
