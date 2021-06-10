package allAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import interfaces.Employee;
import interfaces.FinnanceReport;


/*
 * Spring will use this class as its configuration file. No more xml is needed.
 */
@Configuration
@ComponentScan("allAnnotations")
@PropertySource("classpath:properties.prop")
public class ConfigAnnotation {

	
	//Bean definition for DefinitiveReport class (The one that will be injected):
	@Bean
	public FinnanceReport definitiveReport() {
		return new DefinitiveReport();
	}
	//Bean definition for BeanAnnotation class:
	
	@Bean
	public Employee ceoGenerator() {
		DefinitiveReport report = (DefinitiveReport) definitiveReport();
		return new BeanAnnotation(report);
	}
	
	
}
