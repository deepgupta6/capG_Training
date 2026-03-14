package lab1.ps1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab1.ps1.bean.Employee;
import lab1.ps1.bean.SBU;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ps1.xml");

		Employee emp = (Employee) ctx.getBean("employee");
		emp.printEmployee();

		((ClassPathXmlApplicationContext) ctx).close();

	}

}
