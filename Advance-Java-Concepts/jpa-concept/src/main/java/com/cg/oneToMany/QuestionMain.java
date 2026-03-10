package com.cg.oneToMany;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class QuestionMain {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Question q = new Question("What is Java", "M");
		List<Answer> li = new ArrayList<>();
		
		li.add(new Answer("Java is OOP",q));
		li.add(new Answer("Java is Pi",q));
		li.add(new Answer("Java is Simple",q));
		
		q.setAnswer(li);
		em.persist(q);
		em.getTransaction().commit();
		System.out.println("Created..");
		
		
		
		
	}
}
