package com.employee.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetEmployee {
	
	public GetEmployee() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/api/employee")
	public String getEmployee() {
		return "I am employee..!!";
	}

}
