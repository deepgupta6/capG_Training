package lab1.ps2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab1.ps2.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ps2.xml");

		Employee emp = (Employee) ctx.getBean("employee");
		emp.printEmployee();
		

		((ClassPathXmlApplicationContext) ctx).close();

	}

}
