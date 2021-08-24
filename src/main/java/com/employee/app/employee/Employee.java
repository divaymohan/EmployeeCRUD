package com.employee.app.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private int employeeExperience;
	private String employeePost;
	private String employeeDepartment;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(int employeeId, String employeeName, int employeeSalary, int employeeExperience,
			String employeePost, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeExperience = employeeExperience;
		this.employeePost = employeePost;
		this.employeeDepartment = employeeDepartment;
	}



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
	public String getEmployeePost() {
		return employeePost;
	}
	public void setEmployeePost(String employeePost) {
		this.employeePost = employeePost;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	
}
