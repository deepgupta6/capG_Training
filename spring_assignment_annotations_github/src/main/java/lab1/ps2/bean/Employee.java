package lab1.ps2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${employeeId}")
	private int employeeId;
	@Value("${employeeName}")
	private String employeeName;
	@Value("${salary}")
	private double salary;
	@Value("${businessUnit}")
	private String businessUnit;
	@Value("${age}")
	private int age;
	@Autowired
	@Qualifier("sbu")
	private SBU sbu;
	
	
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
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + ", sbu=" + sbu + "]";
	}
	
	public void printEmployee() {
		System.out.println("Employee details");
		System.out.println("------------------------");
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Employee Name : " + this.employeeName);
		System.out.println("Employee Salary : " + this.salary);
		System.out.println("Employee BU : " + this.businessUnit);
		System.out.println("Employee Age : " + this.age);
		System.out.println("sbu details = " + sbu);
		
	}

}
