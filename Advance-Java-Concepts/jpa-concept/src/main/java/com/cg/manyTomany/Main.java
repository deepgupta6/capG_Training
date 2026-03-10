package com.cg.manyTomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
//		Course c = new Course("JAVA");
//		Set<Course> st = new HashSet<>();
//		st.add(c);
//		Student s = new Student("Amit",st);
//		
//		em.persist(c);
//		em.persist(s);
//		
		em.getTransaction().commit();
		System.out.println("Done");
		
	}

}
