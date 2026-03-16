package lab1.ps3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp3")
public class Employee {
	@Value("${employeeId}")
	private int employeeId;
	@Value("${employeeName}")
	private String employeeName;
	@Value("${salary}")
	private double salary;
	@Value("${age}")
	private int age;
	
	public Employee() {
		
	}
	
	public Employee(int employeeId, String employeeName, double salary, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", age=" + age + "]";
	}
	
	public void printEmployee() {
		System.out.println("Employee details");
		System.out.println("------------------------");
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Employee Name : " + this.employeeName);
		System.out.println("Employee Salary : " + this.salary);
		System.out.println("Employee Age : " + this.age);
		
	}

}
