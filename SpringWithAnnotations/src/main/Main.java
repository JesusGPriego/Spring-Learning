package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import allAnnotations.BeanAnnotation;
import allAnnotations.ConfigAnnotation;
import interfaces.Employee;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Context declaration with xml:
		 /*ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		*/
		//Context declaration with .class:
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
		//getting beans:
		
		Employee employee = context.getBean("commercial", Employee.class);
		Employee admin = context.getBean("admin", Employee.class);
		
		Employee boss = context.getBean("boss",Employee.class);
		Employee boss2 = context.getBean("boss",Employee.class);
		Employee helper = context.getBean("helper",Employee.class);
		BeanAnnotation ceo = context.getBean("ceoGenerator",BeanAnnotation.class);
		//using beans:
		System.out.println(employee.getReport());
		System.out.println(admin.getReport());
		System.out.println(boss + "\n" + boss2);
		System.out.println(helper.getTask());
		System.out.println(ceo.getReport());
		System.out.println(ceo.getBrand());
			
		//closing context:
		
		context.close();
		
		
		
		
	}

}
