package bean;

import java.util.List;

public class HelloWorld {
	private String name;
	private List<String> course;
	
	public HelloWorld() {
		// this is empty Constructor
	}
	
	public HelloWorld(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public String sayHello() {
		return  "Hello " + name + "!";
	}
	
	

}
