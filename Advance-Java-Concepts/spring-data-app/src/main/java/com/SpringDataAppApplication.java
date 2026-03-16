package com;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.entity.Employee;
import com.repo.IEmployeeRepo;

@SpringBootApplication
public class SpringDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);
		
		IEmployeeRepo erepo = ctx.getBean(IEmployeeRepo.class);
		erepo.save(new Employee("Deep", LocalDate.of(2002, 10, 11),10000.0));
	}

}
