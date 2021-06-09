package singletonAndPrototype;

public class Boss implements Employee{

	private ReportCreation reportCreation;
	//This class will get an injection through constructor.
	
	
	//Constructor which has a dependency on a ReportCreation object:
	public Boss(ReportCreation reportCreation) {
		this.reportCreation=reportCreation;
	}
	
	public String getTasks() {
		return "I do boss' tasks";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "This is a boss report: " + reportCreation.getReport();
	}
	
	
}
