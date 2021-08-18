/**
 * 
 */
package com.employee.app.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author dm255078
 *
 */
@RestController
public class employeeController {
	@GetMapping("/api/employees")
	public List<Employee> getEmployees() {
		return Arrays.asList(
				new Employee(1, "Divay", 20000, 1, "Engineer","Cloud"),
				new Employee(2, "Mohan", 50000, 1, "Engineer","Cloud"),
				new Employee(3, "Rohan", 60000, 2, "Engineer","Cloud"),
				new Employee(4, "Shekhar", 80000, 4, "Engineer","Cloud")
				);
	}

}
