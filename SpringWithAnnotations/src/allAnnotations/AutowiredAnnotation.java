package allAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import interfaces.Employee;
import interfaces.FinnanceReport;



@Component("admin")
public class AutowiredAnnotation implements Employee {
	/*
	 * This annotation looks in the whole project for a class that implements
	 * an specific interface. In this case, looks for a class that implements
	 * 'FinnanceReport' interface. Then, automatically injects an instance
	 * of that class to this one.
	 * This is it for autowired in constructor.
	 */
	/*@Autowired
	public AutowiredAnnotation(FinnanceReport reportSample) {
		super();
		this.reportSample = reportSample;
	}
	*/


	//Autowired in field. This works too:
	
	@Autowired
	//In case there are many classes that implments the required interface,
	//it is necessary to specify which class we want to inject.
	//This is done by using @Qualifier("Class name")
	@Qualifier("finnanceReportSample1")
	private FinnanceReport reportSample;
	
	//Autowired in setter method. This work no matter how we call the method.
	/*@Autowired
	public void setReportSample(FinnanceReport reportSample) {
		this.reportSample = reportSample;
	}*/

	@Override
	public String getTask() {
		// TODO Auto-generated method stub
		return "I do admin tasks'";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return reportSample.getFinnanceReport() + "admin's report: ...";
	}
	
	

}
