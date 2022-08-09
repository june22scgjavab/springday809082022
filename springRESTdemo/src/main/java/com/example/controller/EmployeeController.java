package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080/employees
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	// http://localhost:8080/employees/hello
	@GetMapping("/hello")
	public String welcomeToMyRestApplication() {
		return "Coming Soon!!!!!";
	}
	
//	@PustMapping  // ===> update
//  @PostMapping  //=====> adding 
//  @DeleteMapping // ======> delete

}
