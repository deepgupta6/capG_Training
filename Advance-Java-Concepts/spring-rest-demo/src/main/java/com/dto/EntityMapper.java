package com.dto;

import com.entity.Employee;

public class EntityMapper {
	public static Employee convertObjectToEntity(EmployeeDTO edto) {
		return new Employee(edto.getFullName(),edto.getDateOfBirth(),edto.getSalary());
	}
	
	public static EmployeeDTO convertEntityToDto(Employee e) {
		return new EmployeeDTO(e.getEmpid(),e.getName(),e.getDob(),e.getSal());
	}

}
