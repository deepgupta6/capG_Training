package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
	
	public static void main(String[] args) {
		List<Employee> li = new ArrayList<Employee>();
		
		li.add(new Employee(101,"Atul",5600.));
		li.add(new Employee(102,"Amit",45000.));
		li.add(new Employee(103,"Aryan",56000.));
		li.add(new Employee(104,"Aabhishek",56000.));
		li.add(new Employee(105,"Saksham",56000.));
		li.add(new Employee(106,"Ashtam",56000.));
		
		
		long startTime = System.currentTimeMillis();
//		li.stream().filter(e->e.getSal()>50000).forEach(e->System.out.println(e));
//		Employee d = li.stream().max((e1,e2)->e1.getSal().compareTo(e2.getSal())).get();
//		System.out.println(d.getSal());
		double totalSal = li.stream().collect(Collectors.summingDouble(e->e.getSal()));
		long endTime = System.currentTimeMillis();
		System.out.println("Seq:" + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
//		li.stream().filter(e->e.getSal()>50000).forEach(e->System.out.println(e));
//		Employee d = li.stream().max((e1,e2)->e1.getSal().compareTo(e2.getSal())).get();
//		System.out.println(d.getSal());
		totalSal = li.parallelStream().collect(Collectors.summingDouble(e->e.getSal()));
		endTime = System.currentTimeMillis();
		System.out.println("Seq:" + (endTime-startTime));
		
		
	}

}
