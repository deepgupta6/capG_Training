package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.EmployeeDTO;
import com.dto.EntityMapper;
import com.entity.Employee;
import com.exception.EmployeeNotFoundException;
import com.repo.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		return repo.findAll().stream().map(e -> {
			return EntityMapper.convertEntityToDto(e);
		}).toList();
	}

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO e) {
		return EntityMapper.convertEntityToDto(repo.save(EntityMapper.convertObjectToEntity(e)));
	}

	@Override
	public EmployeeDTO getEmployee(int empId) {
		Optional<Employee> emp = repo.findById(empId);
		if (emp.isPresent()) {
			return EntityMapper.convertEntityToDto(emp.get());
		} else
			throw new EmployeeNotFoundException("Employee Not Found");
	}

	@Override
	public String removeEmployee(int empId) {
		if (getEmployee(empId) != null) {
			repo.deleteById(empId);
			return "Employee Deleted";
		} else {
			return "Invalid Id";
		}
	}

	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO e) {
		if (getEmployee(e.getEmployeeId()) != null) {
			return EntityMapper.convertEntityToDto(repo.saveAndFlush(EntityMapper.convertObjectToEntity(e)));
		} else {
			return null;
		}
	}

	@Override
	public List<EmployeeDTO> getEmployeeByName(String name) {
		return repo.findByName(name).stream().map(e -> {
			return EntityMapper.convertEntityToDto(e);
		}).toList();
	}

}
