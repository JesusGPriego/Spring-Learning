package initAndDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"initAndDestroy/applicationContext.xml");
		
		
		Car car1 = context.getBean("carGenerator", Car.class);
		System.out.println(car1.getWheels());


		
		context.close();
		

	}

}
