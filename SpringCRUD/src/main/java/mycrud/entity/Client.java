package mycrud.entity;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@NotNull
	@Size(min = 2, message="Required field. At least 2 characters.")
	@Column(name="name")
	private String name;
	@NotNull
	@Size(min = 2, message="Required field. At least 2 characters.")
	@Column(name="surname")
	private String surname;
	@Size(min = 1, message="Required field.")
	@Email(message="Pleease insert a well-formed email.")
	@Column(name="email")
	private String email;
	
	
	public Client() {
		
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
	
	
	
}
