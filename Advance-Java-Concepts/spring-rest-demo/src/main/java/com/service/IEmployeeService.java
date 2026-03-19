package com.service;

import java.util.List;

import com.dto.EmployeeDTO;
import com.entity.Employee;

public interface IEmployeeService {
	
	public List<EmployeeDTO> getAllEmployee();
	public EmployeeDTO createEmployee(EmployeeDTO e);
	public EmployeeDTO getEmployee(int empId);
	public String removeEmployee(int empId);
	public EmployeeDTO updateEmployee(EmployeeDTO e);
	public List<EmployeeDTO> getEmployeeByName(String name);

}
