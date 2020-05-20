package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	
	@Query(nativeQuery= true,value="select * from emp_table")
	List<Employee> getAllEmployee();
	
	@Query(nativeQuery= true,value="select * from emp_table where empid=?")
	List<Employee> getEmployeeById(String empid);
	
	
	
}
