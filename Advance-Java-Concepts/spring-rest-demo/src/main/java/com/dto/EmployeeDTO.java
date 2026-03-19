package com.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeDTO {
	private int employeeId;
	private String fullName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private double salary;
	
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(int employeeId, String fullName, LocalDate dateOfBirth, double salary) {
		super();
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
