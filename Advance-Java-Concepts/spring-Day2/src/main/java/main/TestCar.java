package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;
import bean.MrfTyre;
import bean.PetrolEngine;

public class TestCar {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

		Car car = (Car) ctx.getBean("car");

		car.printCar();

		((ClassPathXmlApplicationContext) ctx).close();

	}

}
