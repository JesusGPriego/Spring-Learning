package tests;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import entities.*;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(ClientOrders.class)
				.addAnnotatedClass(ClientDetails.class)
				.buildSessionFactory();
		
		Session session = sf.openSession();
		
		try {
			
			Client client = new Client("Paco", "Gomez", "Sevilla");
			ClientDetails clientDetail = new ClientDetails("sampleweb.com", "123456789", "Super");
			
			//Linking objects:
			client.setClientDetails(clientDetail);
			
			session.beginTransaction();
			session.save(client);
			
			session.getTransaction().commit();
			
			
			
		}catch(Exception e) {
			System.out.println("An error has ocurred: " );
			e.printStackTrace();
		}finally {
			session.close();
			sf.close();
		}

	}

}
