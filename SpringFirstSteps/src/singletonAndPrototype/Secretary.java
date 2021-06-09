package singletonAndPrototype;


//This class will handle the dependency through setter method.
//Attrs dependency will also be solved through setter methods
public class Secretary implements Employee {
	
	private ReportCreation reportCreation;
	private String email;
	private String brandName;
	
	@Override
	public String getTasks() {
		// TODO Auto-generated method stub
		return "I do secretary's tasks.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "This is a secretary report: " + reportCreation.getReport();
	}

	//Solving reportCreation field dependency
	public void setReportCreation(ReportCreation reportCreation) {
		this.reportCreation=reportCreation;
	}

	//Solving email dependency
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//Solving brandName dependency
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
	
	
	
	
	
}
