package com.cg.main;

import java.time.LocalDate;
import java.util.List;

import com.cg.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
//		Product p = new Product(101,"Iphone 17",125000, 5, LocalDate.of(2025, 11, 16));
//		Product p  = new Product(102, "Nothing Phone 3", 90000, 10, LocalDate.of(2025, 5, 3));
//		Product p1 = new Product(103, "iPhone 15", 85000, 15, LocalDate.of(2025, 6, 10));
//		Product p2 = new Product(104, "Samsung S25", 92000, 8, LocalDate.of(2025, 7, 5));
//		Product p3 = new Product(105, "OnePlus 13", 75000, 20, LocalDate.of(2025, 8, 18));
//		Product p4 = new Product(106, "Pixel 9", 88000, 12, LocalDate.of(2025, 9, 12));
//		Product p4 = new Product(107, "Nokia 3310", 1200, 50, LocalDate.of(2004, 9, 12));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.persist(p4);
//		tx.commit();
//		System.out.println("Product Created");
		
//		tx.begin();
//		Product p = em.find(Product.class,107);
//		if(p!=null) {
//			em.remove(p);
//			System.out.println(p);
//		}
//		else 
//			System.out.println("Product Not Found");
//		tx.commit();
		
		List<Product> li = em.createQuery("From Product").getResultList();
		li.forEach(p->System.out.println(p));
		

	}

}
