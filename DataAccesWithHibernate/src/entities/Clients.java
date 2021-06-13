package entities;

import javax.persistence.*;

/*
 * This class basically maps an object.
 */

/*
 * @Entity tells hiberrnate that this is a table in the bd.
 * @Table tells hibernate which table it is.
 */
@Entity
@Table(name="clients")
public class Clients {
	
	/*
	 * @Column tells hibernate that those attrs are fields in the db.
	 * @Id tells hiberrnate that this attr is the primary key.
	 * @GeneratedValue tells hibernate how the PK is generated, so hibernate
	 * can recognize it.
	 */
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
	
	
	public Clients() {

		
		
	}


	public Clients(String name, String surname, String address) {

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


	@Override
	public String toString() {
		return "Clients [id=" + id + ", name=" + name + ", surname=" + surname 
				+ ", address=" + address + "]";
	}
	
	
	
	
}
