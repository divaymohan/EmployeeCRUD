package com.employee.app.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;
	
	public List<Employee> getAllTopics(){
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Optional<Employee> getEmployee(int id) {
		//return employees.stream().filter(e->e.getEmployeeId()==id).findFirst().get();
		return employeeRepository.findById(id);
	}

	public void addEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee, int id) {
		
		employeeRepository.save(employee);
		
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
}
