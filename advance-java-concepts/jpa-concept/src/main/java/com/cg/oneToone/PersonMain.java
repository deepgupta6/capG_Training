package com.cg.oneToone;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersonMain {
	public static void main(String[] args) {
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//		EntityManager em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		Person p = new Person("Ankit", LocalDate.of(2003, 10, 21));
//		Dl obj = new Dl(LocalDate.of(2028, 10, 21),LocalDate.of(2024, 10, 21),"LMV");
//		p.setDl(obj);
//		em.persist(obj);
//		em.persist(p);
//		em.getTransaction().commit();
//		System.out.println("Person Created");
		
		
		
		System.out.println(PersonService.updateType(152,"LMV,HMV"));
	}

}
