package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Client;
import entities.ClientDetails;

public class CascadeDeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(ClientDetails.class)
				.buildSessionFactory();
		
		Session session = sf.openSession();
		
		try {
			
			session.beginTransaction();

			//Getting ClientDetails object:
			
			ClientDetails clientDetails = session.get(ClientDetails.class, 3);
			
			//Getting Client using its details:
			
			Client client = clientDetails.getClient();
			
			System.out.println("Client: " + client.toString() + ".\nDetails: "
			+ clientDetails.toString());
			
			System.out.println("Cascade deleting:...");
			
			session.delete(clientDetails);
			
			System.out.println("Details and associated client has been deleted.");
			
			session.getTransaction().commit();
			
			
			
		}catch(Exception e) {
			System.out.println("An error has ocurred: " + e.getMessage());
		}finally {
			session.close();
			sf.close();
		}
		
	}
	
}
