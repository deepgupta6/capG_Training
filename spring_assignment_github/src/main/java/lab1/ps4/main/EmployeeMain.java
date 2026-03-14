package lab1.ps4.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab1.ps4.bean.Employee;
import lab1.ps4.bean.SBU;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ps4.xml");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId: ");
		
		int empId = sc.nextInt();
		
		SBU sbu =(SBU)ctx.getBean("sbu");
		sbu.getEmpList().forEach(e->{
			if(e.getEmployeeId()==empId) {
				System.out.println(e);
			}
		});

		((ClassPathXmlApplicationContext) ctx).close();
		sc.close();

	}

}
