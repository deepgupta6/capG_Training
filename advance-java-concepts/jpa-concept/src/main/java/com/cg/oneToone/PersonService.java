package com.cg.oneToone;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonService {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;
	
	static {
			emf = Persistence.createEntityManagerFactory("my-pu");
			em = emf.createEntityManager();
		    tx = em.getTransaction();
		
	}

	
	public static Person findPerson(int pid) {
		
		tx.begin();
		Person p  = em.find(Person.class, pid);
		if(p!=null) {
			return p;
		}
		tx.commit();
		return null;
		
	}

//	
	public static String updateType(int pid,String type) {
		tx.begin();
		Person p = em.find(Person.class, pid);
		if(p!=null) {
			Dl dl = p.getDl();
			dl.setType(type);
			tx.commit();
			return "Dl type Updated";
		}
		return "Invalid Id";
		
	}
//
	
	public static String deleteEmployee(int pid) {
		tx.begin();
		Person e = em.find(Person.class, pid);
		if(e!=null) {
			em.remove(e);
			em.remove(e.getDl());
			tx.commit();
			return "Employee Deleted";
		}
		return "Invalid Id";
		
	}

}
