package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dto.EmployeeDTO;
import com.dto.EntityMapper;
import com.entity.Employee;
import com.exception.EmployeeNotFoundException;
import com.repo.IEmployeeRepo;
import com.service.EmployeeService;
import com.service.IEmployeeService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SpringRestDemoApplicationTests {
	
	@Mock
	private IEmployeeRepo repo;
	@InjectMocks
	private EmployeeService service;
	
//	@Test
//	void testEmployeeById() {
//		assertNotNull(service.getEmployee(56));
//		assertThrows(EmployeeNotFoundException.class, ()->service.getEmployee(212));
//		assertEquals("Shubhi", service.getEmployee(54).getFullName());
//	}
	
	@Test
	void testEmployeeById() {
		EmployeeDTO eDto = new EmployeeDTO("Raj",LocalDate.of(2003, 10, 2),30000.);
		eDto.setEmployeeId(1001);
		Employee emp = EntityMapper.convertObjectToEntity(eDto);
		Optional<Employee> op = Optional.of(emp);
		when(repo.findById(1001)).thenReturn(op);
		assertNotNull(service.getEmployee(1001));
	}
	
	@Test
	void testEmployeeByIdWithException() {
		when(repo.findById(1002)).thenThrow(EmployeeNotFoundException.class);
		assertThrows(EmployeeNotFoundException.class, ()->service.getEmployee(1002));
		
	}
	
	@Test
	void testCreateEmployee() {
		EmployeeDTO eDto = new EmployeeDTO("Raj",LocalDate.of(2003, 10, 2),30000.);
		eDto.setEmployeeId(1001);
		Employee emp = EntityMapper.convertObjectToEntity(eDto);
		when(repo.save(Mockito.any(Employee.class))).thenReturn(emp);
		assertNotNull(service.createEmployee(eDto));
		
	}
	
	@Test
	void testAllEmployee() {
		List<EmployeeDTO> li = List.of(
				new EmployeeDTO("Raj",LocalDate.of(2003, 10, 2),30000.),
				new EmployeeDTO("Raja",LocalDate.of(2003, 10, 3),30000.),
				new EmployeeDTO("Raju",LocalDate.of(2003, 10, 4),30000.),
				new EmployeeDTO("Raje",LocalDate.of(2003, 10, 5),30000.)
				);
		
		List<Employee> eLi = List.copyOf(
			    li.stream()
			      .map(e -> EntityMapper.convertObjectToEntity(e))
			      .toList()
			);
		
		when(repo.findAll()).thenReturn(eLi);
		
		assertIterableEquals(li, service.getAllEmployee());
	}
	
	@Test
	void testRemoveEmployee() {
		Employee emp = new Employee("Raj",LocalDate.of(2003, 10, 2),30000.);
		emp.setEmpid(1001);
		Optional<Employee> op = Optional.of(emp);
		when(repo.findById(1001)).thenReturn(op);
		assertEquals("Employee Deleted",service.removeEmployee(1001));
		verify(repo).deleteById(1001);
	}
	
	@Test
	void testRemoveEmployeeWhenNotPresent() {
		Optional<Employee> op = Optional.empty();
		when(repo.findById(1001)).thenReturn(op);
		assertThrows(EmployeeNotFoundException.class, ()->service.getEmployee(1001));
		
	}
	
	@Test
	void testUpdateEmployee() {
	    EmployeeDTO eDto = new EmployeeDTO("Raj", LocalDate.of(2003, 10, 2), 30000.);
	    eDto.setEmployeeId(1001);

	    EmployeeDTO eDtoU = new EmployeeDTO("Raja", LocalDate.of(2003, 10, 2), 30000.);
	    eDtoU.setEmployeeId(1001);

	    Employee emp = EntityMapper.convertObjectToEntity(eDto);
	    Optional<Employee> op = Optional.of(emp);

	    Employee empU = EntityMapper.convertObjectToEntity(eDtoU);

	    when(repo.findById(1001)).thenReturn(op);
	    when(repo.saveAndFlush(Mockito.any(Employee.class))).thenReturn(empU);

	    EmployeeDTO result = service.updateEmployee(eDtoU); 

	    assertNotNull(result);
	    assertEquals("Raja", result.getFullName());

	    verify(repo).findById(1001); 
	    verify(repo).saveAndFlush(Mockito.any(Employee.class));
	}
	
	void testGetEmployeeByName() {
		EmployeeDTO eDto = new EmployeeDTO("Raj",LocalDate.of(2003, 10, 2),30000.);
		eDto.setEmployeeId(1001);
		List<EmployeeDTO> li = List.of(eDto);
		Employee emp = EntityMapper.convertObjectToEntity(eDto);
		List<Employee> eli = List.of(emp);
		when(repo.findByName("Raj")).thenReturn(eli);
		assertEquals(li,service.getEmployeeByName("Raj"));
	}
	
	
}
