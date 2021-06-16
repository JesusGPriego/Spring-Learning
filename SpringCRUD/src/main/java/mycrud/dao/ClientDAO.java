package mycrud.dao;

import java.util.List;

import mycrud.entity.Client;

public interface ClientDAO {
	
	
	public List<Client> getClients();

	public void insertClient(Client client);

	public Client getClient(int id);

	public void updateClient(Client client);

	public void delete(int id);

}
