package com.employee.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeCrudApplication {
	
	@GetMapping("/app")
	public String Main() {
		return "This is my app..!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
		
	}

}
