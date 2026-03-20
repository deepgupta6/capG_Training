package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmployeeDTO;
import com.entity.Employee;
import com.service.IEmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("employees")
@Tag(name = "EmployeeAPI", description = "This provide the CRUD operation with Employee Enitity")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	public EmployeeController(IEmployeeService service) {
		this.service = service;
	}
	
	@Operation(summary = "This API will provide all employees details fom MYSQL DB")
	@GetMapping("/{empId}")
	public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable int empId) {
		EmployeeDTO e = service.getEmployee(empId);
		return new ResponseEntity<EmployeeDTO>(e,HttpStatus.OK);
	
	}
	
	@GetMapping(produces = {"application/json","application/xml"})
	public List<EmployeeDTO> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	@GetMapping(value = "/name/{name}",produces = {"application/json","application/xml"})
	public List<EmployeeDTO> getEmployeeByName(String name) {
		return service.getEmployeeByName(name);
	}
	
	@DeleteMapping("/{empId}")
	public String removeEmployee(@PathVariable int empId) {
		return service.removeEmployee(empId);
		
	}
	
	@PostMapping(consumes = {"application/json","application/xml"})
	public EmployeeDTO createNewEmployee(@RequestBody @Valid EmployeeDTO emp) {
		return service.createEmployee(emp);
	}
	
	@PutMapping
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO emp) {
		return service.updateEmployee(emp);
	}
	
}
