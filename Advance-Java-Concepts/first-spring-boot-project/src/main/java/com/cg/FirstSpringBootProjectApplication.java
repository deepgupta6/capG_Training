package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.cg.model.HelloWorld;

import com.cg.model.*;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		
//		HelloWorld h = (HelloWorld)ctx.getBean(HelloWorld.class);
//		System.out.println(h.sayHello(" Deep"));
		
		Employee emp = (Employee)ctx.getBean("employee");
        emp.printEmployeeInfo();
        //ctx.close();
	}

}
