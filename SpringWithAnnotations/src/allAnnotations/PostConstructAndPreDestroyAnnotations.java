package allAnnotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


import interfaces.Employee;

//No annotations here, but 2 interfaces. In case we could use the annotions, those would be
//PostConstruct and PreDestroy.
//Those annotations only work with singleton pattern.
@Component("helper")
public class PostConstructAndPreDestroyAnnotations implements Employee, InitializingBean, DisposableBean	{

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing connections...");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting connections...");
		
	}

	@Override
	public String getTask() {
		// TODO Auto-generated method stub
		return "I do helper's tasks.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Helper report: ...";
	}

	
	
	
	
	
}
