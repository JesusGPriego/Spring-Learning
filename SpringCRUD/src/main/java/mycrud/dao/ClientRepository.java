package mycrud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mycrud.entity.Client;

@Repository
public class ClientRepository implements ClientDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Client> getClients() {
		//Get session
			Session session = sessionFactory.getCurrentSession();
			//query
			
			Query<Client> query = session.createQuery("from Client", Client.class);
			
			//exec query
			
			List<Client> clients = query.getResultList();
			
			
			return clients;
	}

	@Override
	@Transactional
	public void insertClient(Client client) {
		
		
		//Get session:
		Session session = sessionFactory.getCurrentSession();
		
		//Save client:
		
		session.save(client);
		
	}

	@Override
	@Transactional
	public Client getClient(int id) {

		
		Session session = sessionFactory.getCurrentSession();
		
		Client client = session.get(Client.class, id);
		
		return client;
		
	}

	@Override
	@Transactional
	public void updateClient(Client client) {
		
			//Get session:
			Session session = sessionFactory.getCurrentSession();
			
			//update client:
			
			session.update(client);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		
			//Get session:
			Session session = sessionFactory.getCurrentSession();
			


			session.createQuery("delete Client where id="+id).executeUpdate();
		
	}

	
	
	
}
