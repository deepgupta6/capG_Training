package com.dto;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDTO {
	private int employeeId;
	@NotNull(message = "Name is Required")
	@NotBlank(message = "Enter Valid name")
	private String fullName;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate dateOfBirth;
	@NotNull(message = "Salary is Required")
	@Min(value = 10000,message = "Salary is very low")
	private double salary;
	
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(String fullName, LocalDate dateOfBirth, double salary) {
		super();
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

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, employeeId, fullName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && employeeId == other.employeeId
				&& Objects.equals(fullName, other.fullName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
	
	
}
