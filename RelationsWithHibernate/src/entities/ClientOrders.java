package entities;

import java.util.GregorianCalendar;

import javax.persistence.*;


@Entity
@Table(name="orders")
public class ClientOrders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="order_date")
	private GregorianCalendar date;
	@Column(name="payment_method")
	private String paymentMethod;
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.DETACH, 
			CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name="client_id")
	private Client client;
	
	public ClientOrders() {
		
	}
	
	public ClientOrders(GregorianCalendar date2) {
		super();
		this.date = date2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GregorianCalendar getDate() {
		return date;
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "ClientOrders [id=" + id + ", date=" + date.getTime() + ", paymentMethod=" + paymentMethod + ", client=" + client
				+ "]";
	}
	

}
