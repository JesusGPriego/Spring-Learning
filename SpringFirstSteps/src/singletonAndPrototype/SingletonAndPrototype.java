package singletonAndPrototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonAndPrototype {

	public static void main(String[] args) {
		
		
		//xml context load:
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"singletonAndPrototype/applicationContext.xml");
		
		//bean ask (singleton pattern):
		
		Secretary secretary = context.getBean("secretaryGenerator",Secretary.class);
		Secretary secretary2 = context.getBean("secretaryGenerator",Secretary.class);
		
		
		
		//bean ask (prototype pattern):
		Secretary secretary3 = context.getBean("secretaryGeneratorPrototype",Secretary.class);
		Secretary secretary4 = context.getBean("secretaryGeneratorPrototype",Secretary.class);
		
		
		
		if(secretary == secretary2)
			System.out.println("objects are the same");
		else
			System.out.println("objects are not the same");
		
		if(secretary3 == secretary4)
			System.out.println("objects are the same");
		else
			System.out.println("objects are not the same");
		
		context.close();
		
	}
	
}
