package testsWithHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Clients;

public class InsertRegister {

	public static void main(String[] args) {
		/*Steps:
			1. Create SessionFactory object.
			2. Create Session object.
			3. Create Clients object.
			4. Execute transaction.
		 */
		
		//1. Create SessionFactory object.
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Clients.class)
				.buildSessionFactory();
		
		//2. Create Session object.
		 Session session = sf.openSession();
		
		 try {
			//3. Create Clients object:
			 Clients client = new Clients("Maria", "Gomez","Main Avenue");
			 
			//4. Execute transaction. 
			 session.beginTransaction();
			 session.save(client);
			 session.getTransaction().commit();
			 System.out.println("Reading register with id: " + client.getId());
			 //Reading the id (thanks to @GeneratedValue
			 session.beginTransaction();
			 Clients readedClient = session.get(Clients.class, client.getId());
			 System.out.println("Register: " + readedClient.toString());
			 session.getTransaction().commit(); 
			 System.out.println("Operation finished.");
			 session.close();
			 
			 
		 }catch(Exception ex){
			 System.out.println("Error in transaction: " + ex.getMessage());
		 }finally {
			 sf.close();
		 }
	}
	 
}
