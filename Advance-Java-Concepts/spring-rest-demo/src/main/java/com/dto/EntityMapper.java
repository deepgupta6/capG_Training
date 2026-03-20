package com.dto;

import com.entity.Employee;

public class EntityMapper {
	public static Employee convertObjectToEntity(EmployeeDTO edto) {
		return new Employee(edto.getFullName(),edto.getDateOfBirth(),edto.getSalary());
	}
	
	public static EmployeeDTO convertEntityToDto(Employee e) {
		EmployeeDTO dto =  new EmployeeDTO(e.getName(),e.getDob(),e.getSal());
		dto.setEmployeeId(e.getEmpid());
		return dto;
	}

}
