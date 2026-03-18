package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {
	
	@GetMapping("/abc")
	public @ResponseBody String sayHello() {
		return "Hello Deep";
	}
	
	@GetMapping("/xyz")
	public String sayHello1() {
		return "Hello";
	}
	
	@GetMapping("/xyz/{name}/ab")
	public String sayHello12(@PathVariable String name) {
		return "Hello " + name;
	}



}
