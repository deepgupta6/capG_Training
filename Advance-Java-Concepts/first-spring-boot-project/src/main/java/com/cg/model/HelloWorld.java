package com.cg.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	private String name;
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(String name) {
		this.name = name;
	}
	
	public String sayHello(String name) {
		return "Hello" +name;
	}
}
