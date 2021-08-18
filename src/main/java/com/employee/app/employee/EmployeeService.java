package com.employee.app.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<Employee> employees = new ArrayList<Employee>(Arrays.asList(
			new Employee(1, "Divay", 20000, 1, "Engineer","Cloud"),
			new Employee(2, "Mohan", 50000, 1, "Engineer","Cloud"),
			new Employee(3, "Rohan", 60000, 2, "Engineer","Cloud"),
			new Employee(4, "Shekhar", 80000, 4, "Engineer","Cloud")
			));
	public List<Employee> getAllTopics(){
		return employees;
	}
	
	public Employee getEmployee(int id) {
		return employees.stream().filter(e->e.getEmployeeId()==id).findFirst().get();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}

	public void updateEmployee(Employee employee, int id) {
		for(int i=0;i<employees.size();i++) {
			Employee e = employees.get(i); 
			if(e.getEmployeeId()==id) {
				employees.set(i, employee);
				return;
			}
		}
		
	}

	public void deleteEmployee(int id) {
		employees.removeIf(e->e.getEmployeeId()==id);
		return;
	}
}
