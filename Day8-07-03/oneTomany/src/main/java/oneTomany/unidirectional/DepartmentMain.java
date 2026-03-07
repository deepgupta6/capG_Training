package oneTomany.unidirectional;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DepartmentMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidirectional");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Amit",23,20000.0));
		emp.add(new Employee("Abhishek",25,20900.0));
		emp.add(new Employee("Ashtam",24,29000.0));
		emp.add(new Employee("Sahil",23,30000.0));
		Department d = new Department("CSE",emp);
		em.persist(d);
		em.getTransaction().commit();
	}

}
