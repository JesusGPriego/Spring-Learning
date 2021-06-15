package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Client;
import entities.ClientDetails;

public class DeleteTest {

	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(ClientDetails.class)
				.buildSessionFactory();
		
		Session session = sf.openSession();
		
		try {
			
			session.beginTransaction();
			//Gettin client to delete:
			
			Client client = session.get(Client.class, 2);
			
			if(client!=null) {
				session.delete(client);
			}
			
			session.getTransaction().commit();
			
			session.close();
			
		}catch(Exception e) {
			System.out.println("An error has ocurred: " + e.getMessage());
		}finally {
			sf.close();
		}
		
		
	}
	
}
