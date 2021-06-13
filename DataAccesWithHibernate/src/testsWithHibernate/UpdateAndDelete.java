package testsWithHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Clients;

public class UpdateAndDelete {

public static void main(String[] args) {
		
		//1. Create SessionFactory object.
			SessionFactory sf = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Clients.class)
					.buildSessionFactory();
			
			//2. Create Session object.
			 Session session = sf.openSession();
		
		 try {
			 //Updating with OOP
			 /*int idClientToModify = 1;
			 
			 session.beginTransaction();
			 
			 Clients client = session.get(Clients.class, idClientToModify);
			 
			 client.setName("SuleWare");
			 
			 session.getTransaction().commit();
			 
			 System.out.println("Client updated successfully");*/
			 //Updating with HQL
			 
			 session.beginTransaction();
			 //update
			 session.createQuery("update Clients set surname='Priego' where surname LIKE "
			 		+ "'S%'").executeUpdate();
			  //delete
			 session.createQuery("delete Clients where id=2").executeUpdate();
			 
			 session.getTransaction().commit();
			 
			 session.close();
		 }catch(Exception e) {
			 System.out.println("An error has occured: " + e.getMessage());
		 }finally {
			 sf.close();
		 }	 	 
		
	}
	
}
