package com.service;

import java.util.List;

import com.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee> getAllEmployee();
	public Employee createEmployee(Employee e);
	public Employee getEmployee(int empId);
	public String removeEmployee(int empId);
	public Employee updateEmployee(Employee e);

}
