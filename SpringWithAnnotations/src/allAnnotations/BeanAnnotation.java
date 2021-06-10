package allAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import interfaces.Employee;
import interfaces.FinnanceReport;


public class BeanAnnotation implements Employee {


	private FinnanceReport report;
	@Value("${email}")
	private String email;
	@Value("${brand}")
	private String brand;
	
	public String getEmail() {
		return email;
	}

	public String getBrand() {
		return brand;
	}

	public BeanAnnotation(FinnanceReport report) {
		super();
		this.report = report;
	}

	@Override
	public String getTask() {
		// TODO Auto-generated method stub 
		return "I do CEO's tasks.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return  report.getFinnanceReport() + " CEO's report: ...";
	}

}
