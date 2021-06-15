package tests;

import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Client;
import entities.ClientDetails;
import entities.ClientOrders;

public class OneToManyTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.addAnnotatedClass(ClientDetails.class)
				.addAnnotatedClass(ClientOrders.class)
				.buildSessionFactory();
		
		Session session = sf.openSession();
		
		try {
			//Getting client from database table
			Client client = session.get(Client.class, 1);
			
			GregorianCalendar date=new GregorianCalendar(2021,6,15);
			
			//Creating orders:
			ClientOrders order1 = new ClientOrders(date);
			ClientOrders order2 = new ClientOrders(date);
			ClientOrders order3 = new ClientOrders(date);
			
			session.beginTransaction();
			//Linking objects:
			client.addClientOrder(order1);
			client.addClientOrder(order2);
			client.addClientOrder(order3);
			
			//Saving orders in database:
			
			session.save(order1);
			session.save(order2);
			session.save(order3);
			
			
			session.save(client);
			
			session.getTransaction().commit();
			
			
			
		}catch(Exception e) {
			System.out.println("An error has ocurred: ");
			e.printStackTrace();
		}finally {
			session.close();
			sf.close();
		}

	}
	
}
