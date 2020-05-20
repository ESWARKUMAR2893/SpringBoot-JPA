package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo empRepo;
	
	public List<Employee> getAllEmployee() {
		return empRepo.getAllEmployee();
	}
	
	public Employee getEmployeeById(String empid) {
		return empRepo.getEmployeeById(empid);
	}

	public Employee saveEmp(Employee employee) {
		return empRepo.save(employee);
	}

	public void deleteEmp(Employee employee) {
		empRepo.delete(employee);
	}

	
}
