package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import lab1.ps3.bean.Employee;
import lab1.ps3.bean.SBU;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class SpringBootLab1Application {
	
	@Bean
	@Scope("prototype")
	public Employee getEmp() {
		return new Employee();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootLab1Application.class, args);
		Scanner sc = new Scanner(System.in);

		
//      ps1
//		Employee emp = (Employee)ctx.getBean("emp1");
//		emp.printEmployee();
		
//      ps2
//		Employee emp = (Employee) ctx.getBean("emp2");
//		emp.printEmployee();
		
//		ps3
		SBU sbu =(SBU)ctx.getBean("sbu3");
		System.out.println("Enter total number of Employee");
		int n = sc.nextInt();
		List<Employee> li = new ArrayList<>();
		sc.nextLine();
		while(n-->0) {
			Employee emp =(Employee) ctx.getBean("getEmp");
			System.out.println("Enter empId,empName,empSal and empAge");
			emp.setEmployeeId(sc.nextInt());
			//sc.nextLine();
			emp.setEmployeeName(sc.next());
			emp.setSalary(sc.nextDouble());
			emp.setAge(sc.nextInt());
			sbu.getEmpList().add(emp);
			
		}
		
		sbu.printSbuDetails();
		
		
		
//		ps4	
//		System.out.println("Enter empId: ");
//		
//		int empId = sc.nextInt();
//		sc.nextLine();
//		
//		SBU sbu =(SBU)ctx.getBean("sbu4");
//		sbu.getEmpList().forEach(e->{
//			if(e.getEmployeeId()==empId) {
//				System.out.println(e);
//			}
//		});
		sc.close();
		
	}
	

}
