package testsWithHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Clients;

public class QuerysHQL {

	public static void main(String[] args) {
		
		//1. Create SessionFactory object.
			SessionFactory sf = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Clients.class)
					.buildSessionFactory();
			
			//2. Create Session object.
			 Session session = sf.openSession();
		
		 try {
			 session.beginTransaction();
			 
			 //Clients query:
			 List<Clients> clientList = session.createQuery("from Clients").getResultList();
			 
			 readRegisters(clientList);
			 
			 //Filtered query:
			 
			 clientList = session.createQuery("from Clients clients where clients.id=1")
					 .getResultList();
			 
			 readRegisters(clientList);
			 
			 clientList = session.createQuery("from Clients clients where clients.id=1"
			 		+ " or clients.id = 2")
					 .getResultList();
			 
			 readRegisters(clientList);
			 
			 session.getTransaction().commit();
			 
			 session.close();
		 }catch(Exception e) {
			 System.out.println("An error has occured: " + e.getMessage());
		 }finally {
			 sf.close();
		 }
		 
		 
			 
				 
		
	}

	private static void readRegisters(List<Clients> clientList) {
		for(Clients client : clientList) {
			 System.out.println(client.toString());
		 }
	}
	
	
}
