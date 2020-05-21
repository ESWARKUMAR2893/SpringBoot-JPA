package com.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import javax.validation.Valid;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class EmployeeController {

	
	EmployeeService empService;
	
	@Autowired
	public EmployeeController(EmployeeService empService) {
		this.empService = empService;
	}

	@GetMapping(value = "/employeeList")
	public List<Employee> getAllEmployee(){
		
		return this.empService.getAllEmployee();
		
	}
	
	@GetMapping(value = "/employeeList/{empid}")
	public Employee getEmployeeById(@PathVariable("empid") String empid){
	  
		return Optional.ofNullable(this.empService.getEmployeeById(empid))
				.orElseThrow(() -> new EmployeeNotFoundException("User not found with id :" + empid));
	   
	}
	
	
	@PostMapping(value = "/createEmployee")
	public String createEmployee(@Valid @RequestBody Employee employee) {
		
		this.empService.saveEmp(employee);
		return "success";
	}
	
	@PutMapping("/updateEmployee/{id}")
	  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable String id) {

	     Employee emp = this.empService.getEmployeeById(id);
	      
	        emp.setEmailId(newEmployee.getEmailId());
	        emp.setEmployeeName(newEmployee.getEmployeeName());
	        
	        return this.empService.saveEmp(emp);
	   }
	
	
	
	@DeleteMapping(value = "/deleteEmployee/{empid}")
    public Map<String, Boolean> deleteEmployee(@PathVariable("empid") String empid) {
        Employee employee = this.empService.getEmployeeById(empid);
       
        this.empService.deleteEmp(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
	
	
	
	@GetMapping(value ="/findAll")
    public List<Employee> findAllEmployee(){
		
		return this.empService.findAll();
		
	}
	
	@GetMapping(value="/findById/{id}")
	public Optional<Employee> findEmpById(@PathVariable("id") long id) {
		
		return this.empService.findById(id);
	}
	
	
	
}
