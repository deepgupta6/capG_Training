package com.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repo.IEmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	IEmployeeRepo erepo;
	public String createEmployee(Employee emp) {
		erepo.saveAndFlush(emp);
		return "Employee Created...";
	}
	
	public List<Employee> getAllEmployee(){
		return erepo.findAll();
	}
	
	public Optional<Employee> getEmployee(int empId) {
		  return erepo.findById(empId);
		
	}
	
	public String removeEmployee(int empId) {
		if(getEmployee(empId).isPresent()) {
			erepo.deleteById(empId);
			return "Employee Deleted...";
		}
		else {
			return "Id not found...";
		}
	}
	
	public String updateEmployee(Employee emp) {
		erepo.saveAndFlush(emp);
		return "Employee Updated...";
	}
	
	public List<Employee> getEmployeeByName(String name){
		return erepo.findByName(name);
	}
	
	public List<Employee> getEmployeeBySalary(double sal){
		return erepo.findBySalLessThan(sal);
	}
	
	public List<Employee> getDistinctEmployee(String name){
		return erepo.findDistinctByName(name);
	}
	
	public List<Employee> getEmployeeInMonth(LocalDate startDate, LocalDate endDate){
		return erepo.findByDobBetween(startDate,endDate);
	}
	
	public List<Employee> getEmployeeInAMonth(int m,int y){
		return erepo.findByMonth(m,y);
	}
}
