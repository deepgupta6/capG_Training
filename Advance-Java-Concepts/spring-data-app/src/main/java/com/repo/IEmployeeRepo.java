package com.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByName(String name);
	
	@Query("select e from Employee e where e.name=:n")
	public List<Employee> findByNa(@Param("n") String name);
	
	public List<Employee> findBySalLessThan(double sal);
	
	public List<Employee> findDistinctByName(String name);
	
	public List<Employee> findByDobBetween(LocalDate startDate, LocalDate endDate);
	
	@Query("select e from Employee e where MONTH(e.dob)=:m and YEAR(e.dob)=:y")
	public List<Employee> findByMonth(int m,int y);
}
