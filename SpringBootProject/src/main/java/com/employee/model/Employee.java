package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="empTable")
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@NotBlank
	@Column(name="empid")
	private String employeeId;
	
	@Size(min = 5, max = 12)
	@Column(name="empname")
	private String employeeName;
	
	
	@Column(name="email")
	private String emailId;

	public Employee() {
		
	}
	
	public Employee(long id, String employeeId, String employeeName, String emailId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId="
				+ emailId + "]";
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
	
	
	
}
