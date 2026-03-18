package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repo.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService{
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public Employee createEmployee(Employee e) {
		return repo.save(e);
	}

	@Override
	public Employee getEmployee(int empId) {
		return repo.findById(empId).orElse(null);
	}

	@Override
	public String removeEmployee(int empId) {
		if(getEmployee(empId)!=null) {
			repo.deleteById(empId);
			return "Employee Deleted";
		} else {
			return "Invalid Id";
		}
	}

	@Override
	public Employee updateEmployee(Employee e) {
		if(getEmployee(e.getEmpid())!=null) {
			return repo.saveAndFlush(e);	
		} else {
			return null;
		}
	}

}
