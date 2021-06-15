package tests;

import java.util.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Client;
import entities.ClientDetails;
import entities.ClientOrders;

public class GetClientOrders {

	
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
			
			session.beginTransaction();
			
			System.out.println(client.toString());
			List<ClientOrders> orders = client.getOrders();
			for(ClientOrders order : orders) {
				System.out.println(order.toString());
			}
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
