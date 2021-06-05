package com.cg.Employee.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/getEmployeeDetails")
	public String getData() {
		
		return "this is a Employee";
	}
	
	
}
