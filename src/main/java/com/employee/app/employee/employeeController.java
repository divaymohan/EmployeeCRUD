/**
 * 
 */
package com.employee.app.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author dm255078
 *
 */
@RestController
public class employeeController {
	@Autowired
	private EmployeeService employeeService; 
	
	@GetMapping("/api/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllTopics();
	}
	
	@GetMapping("/api/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
		
	}
	
	@PostMapping("/api/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/api/employees/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
		employeeService.updateEmployee(employee,id);
	}
	
	@DeleteMapping("/api/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		
	}
	
}
