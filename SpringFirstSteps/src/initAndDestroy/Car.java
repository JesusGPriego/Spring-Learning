package initAndDestroy;

public class Car {
	
	
	public int getWheels() {
		return 4;
	}
	
	
	//init. All this will be executed before the bean is created.
	
	public void init() {
		System.out.println("Init starting...");
		//code to execute
	}
	
	
	//destroy. This method will be executed when the bean is destroyed.
	
	public void destroy() {
		System.out.println("Destroy starting...");
		//code to execute
	}
	
}
