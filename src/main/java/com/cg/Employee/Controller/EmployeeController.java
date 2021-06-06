package com.cg.Employee.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Employee.Entity.Employee;

@RestController
public class EmployeeController {

	private Employee emp;
	
	@GetMapping("/getEmployeeDetails")
	public ResponseEntity<Employee> getData() {
		
		emp = new Employee("lara",21);
		return new ResponseEntity<>(emp,HttpStatus.OK);
		
		
	}
	
	
}
