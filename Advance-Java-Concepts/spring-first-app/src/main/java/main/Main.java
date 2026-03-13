package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.HelloWorld;

public class Main {

	
	private Main() {
		// empty constructor
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWorld h1 = (HelloWorld) ctx.getBean("hello");
		HelloWorld h2 = (HelloWorld) ctx.getBean("hello");
		
		h1.setName("Deep");
		
//		System.out.println(h1);
//		System.out.println(h2);
//		
//		System.out.println(h1.sayHello());
//		System.out.println(h2.sayHello());
		
		System.out.println(h1.getCourse());
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
