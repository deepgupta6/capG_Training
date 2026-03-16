package com.cg.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${empId}")
    private int empId;
	@Value("${name}")
    private String name;
    //@Autowired
    private Address address;
    
//    public Employee() {
//    	
//    }
    
    
    public Employee(Address address ) {
    	this.address = address;
    }

//    public Employee(int empId, String name, Address address) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.address = address;
//	}

	public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public void printEmployeeInfo(){
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " +name);
        System.out.println("==========Address=============");
        System.out.println("City: " + address.getCity());
        System.out.println("Country: " + address.getCountry());
        System.out.println("Zip: " +  address.getZip());
    }
}