package iocXMLconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	 
	public static void main(String[] args) {
		
		//getting a context for Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocXMLconfig/applicationContext.xml");
		
		//Employee object creation
		Employee employee1 = context.getBean("bossGenerator",Employee.class);
		
		//Employee object usage
		
		System.out.println(employee1.getTasks());
		
		//context close
		context.close();
	}

}
