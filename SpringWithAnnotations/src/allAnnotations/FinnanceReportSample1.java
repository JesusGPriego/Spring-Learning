package allAnnotations;

import org.springframework.stereotype.Component;

import interfaces.FinnanceReport;


@Component
public class FinnanceReportSample1 implements FinnanceReport {

	@Override
	public String getFinnanceReport() {
		// TODO Auto-generated method stub
		return "This is a sample report 1: ";
	}

}
