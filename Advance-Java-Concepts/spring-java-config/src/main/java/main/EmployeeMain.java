package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.MyConfig;
import model.Employee;

public class EmployeeMain {
    public static void main(String[] args) {

    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);;
        Employee emp = (Employee)context.getBean("employee");
        emp.printEmployeeInfo();
        context.close();
    }
}