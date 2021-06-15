package entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="address")
	private String address;
	/*
	 * Fetcytype.lazy=information will be provided when we need it, not when
	 * client is created.
	 * 
	 * Since my tables are really small, ill set it to eager.
	 */
	@OneToMany(fetch=FetchType.EAGER, mappedBy="client", cascade= {CascadeType.PERSIST, CascadeType.DETACH, 
			CascadeType.MERGE, CascadeType.REFRESH})
	private List<ClientOrders> orders;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private ClientDetails clientDetails;
	

	public Client() {
		
	}

	public Client(String name, String surname, String address) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}
	
	public void addClientOrder(ClientOrders order) {
		if (orders==null) {
			orders = new ArrayList<>();
		}
		
		orders.add(order);
		order.setClient(this);
		
	}

	public List<ClientOrders> getOrders() {
		return orders;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", surname=" + surname + ", address=" + address + "]";
	}

	
	
	
}
