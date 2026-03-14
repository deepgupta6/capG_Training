package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Librarian;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Librarian lib = (Librarian)ctx.getBean("librarian");
		
		lib.issueBook();
		
		((ClassPathXmlApplicationContext)ctx).close();
		

	}

}
