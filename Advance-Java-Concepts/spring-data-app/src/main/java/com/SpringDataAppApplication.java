package com;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.entity.Employee;
import com.service.EmployeeService;

@SpringBootApplication
public class SpringDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);
		EmployeeService es = ctx.getBean(EmployeeService.class);
	
//		es.getDistinctEmployee("Saksham").forEach(e->System.out.println(e));
		
//		es.getEmployeeInMonth(LocalDate.of(2002, 10, 01),LocalDate.of(2002, 10, 30)).forEach(e->System.out.println(e));
		
		es.getEmployeeInAMonth(10,2002).forEach(e->System.out.println(e));
		
//		es.getAllEmployee().forEach(e->System.out.println(e));
//		Optional<Employee> emp = es.getEmployee(1);
//		
//		if(emp.isPresent()) {
//			System.out.println(emp);
//		} else {
//			System.out.println("Employee Not Found");
//		}
//		
		
//		Employee emp = new Employee("Ashtam", LocalDate.of(2002, 10, 11),10000.0);
//		emp.setEmpid(1);
//		emp.setName("Deep Gupta");
//		es.updateEmployee(emp);
		
	}

}
