package com.springboot.webjsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String password;
	private String lastname;
	
	
	public User() {
		
	}


	public User(String firstname, String password, String lastname) {
		this.firstname = firstname;
		this.password = password;
		this.lastname = lastname;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", password=" + password + ", lastname=" + lastname
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
