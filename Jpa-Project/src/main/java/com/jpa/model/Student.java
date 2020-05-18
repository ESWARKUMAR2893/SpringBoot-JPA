package com.jpa.model;

import javax.persistence.*;

@Entity
@Table(name="class")
public class Student {

	@Id
	@Column(name="no")
	private long no;
	
	@Column(name="first")
	private String first_name;
	@Column(name="last")
	private String last_name;
	
	
	public Student(long no, String first_name, String last_name) {
		super();
		this.no = no;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	
	
	
}
