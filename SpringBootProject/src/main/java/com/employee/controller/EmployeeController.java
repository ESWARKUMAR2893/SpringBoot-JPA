package com.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import javax.validation.Valid;


@RestController
@CrossOrigin
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping(value = "/employeeList")
	public List<Employee> getAllEmployee(){
		
		return empService.getAllEmployee();
		
	}
	
	@GetMapping(value = "/employeeList/{empid}")
	public Employee getEmployeeById(@PathVariable("empid") String empid){
		
		return empService.getEmployeeById(empid);
		
	}
	
	
	@PostMapping(value = "/createEmployee")
	public String createEmployee(@Valid @RequestBody Employee employee) {
		
		System.out.println(employee.toString());
		empService.saveEmp(employee);
		return "success";
	}
	
	
	@DeleteMapping(value = "/deleteEmployee/{empid}")
    public Map<String, Boolean> deleteEmployee(@PathVariable("empid") String empid) {
        Employee employee = empService.getEmployeeById(empid);
       
        empService.deleteEmp(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
	
	
	
	
	
}
