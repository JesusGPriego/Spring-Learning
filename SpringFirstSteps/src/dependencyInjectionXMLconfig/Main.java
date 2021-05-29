package dependencyInjectionXMLconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"dependencyInjectionXMLconfig/applicationContext.xml");
		
		Employee employee = context.getBean("bossGenerator",Employee.class);
		System.out.println(employee.getTasks() + "\n" + employee.getReport());
		
		Secretary secretary = context.getBean("secretaryGenerator",Secretary.class);
		System.out.println(secretary.getTasks() + "\n" + secretary.getReport());
		System.out.println(secretary.getEmail());
		System.out.println(secretary.getBrandName());
		context.close();
		
	}
	
}
