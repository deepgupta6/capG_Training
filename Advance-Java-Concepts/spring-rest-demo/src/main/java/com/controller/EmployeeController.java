package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.IEmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	public EmployeeController(IEmployeeService service) {
		this.service = service;
	}
	
	@GetMapping("{empId}")
	public Employee getEmployee(@PathVariable int empId) {
		return service.getEmployee(empId);
	}
	
	@GetMapping
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	@DeleteMapping("/{empId}")
	public String removeEmployee(@PathVariable int empId) {
		return service.removeEmployee(empId);
		
	}
	
	@PostMapping
	public Employee createNewEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	
}
