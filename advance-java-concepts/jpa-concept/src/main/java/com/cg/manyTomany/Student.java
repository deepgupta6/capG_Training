package com.cg.manyTomany;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	private String sName;
	@ManyToMany()
	private Set<Course> courses;
	
	public Student() {
		
	}
	
	public Student(String sName, Set<Course> courses) {
		super();
		this.sName = sName;
		this.courses = courses;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	

}
