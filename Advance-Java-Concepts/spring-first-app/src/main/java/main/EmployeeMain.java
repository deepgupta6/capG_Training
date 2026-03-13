package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Employee;

public class EmployeeMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = (Employee) context.getBean("e");
        emp.printEmployeeInfo();
        context.close();
    }
}