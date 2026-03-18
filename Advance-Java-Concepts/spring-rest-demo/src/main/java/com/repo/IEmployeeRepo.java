package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer>{

}
