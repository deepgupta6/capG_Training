package lab1.ps3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab1.ps3.bean.Employee;
import lab1.ps3.bean.SBU;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ps3.xml");
		
		SBU sbu =(SBU)ctx.getBean("sbu");
		sbu.printSbuDetails();

		((ClassPathXmlApplicationContext) ctx).close();

	}

}
