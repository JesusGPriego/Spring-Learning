package mvcWithTags.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import customValidation.PostalCode;

public class Teacher {
	/*
	 * Validation in Class.
	 */
	@NotNull
	@Size(min = 2, message="Required Field. At least 2 characters.")
	private String name;
	
	private String surname;
	
	private String subject;
	
	private String city;
	
	private String genre;
	
	private String language;
	
	@Min(value=18, message="Minimun age is 18.")
	@Max(value=120, message="Maximum age is 120.")
	private int age;
	@NotEmpty(message="Required field")
	@Email
	private String email;
	@NotEmpty(message="Required field.")
	//@Pattern(regexp="[0-9]{5}", message="Please insert 5 numeric characters.")
	@PostalCode
	private String postalCode;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
