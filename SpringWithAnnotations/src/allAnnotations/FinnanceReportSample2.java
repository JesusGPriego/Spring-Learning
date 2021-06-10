package allAnnotations;

import org.springframework.stereotype.Component;

import interfaces.FinnanceReport;

@Component
public class FinnanceReportSample2 implements FinnanceReport {

	@Override
	public String getFinnanceReport() {
		// TODO Auto-generated method stub
		return "This a sample report 2:";
	}

}
