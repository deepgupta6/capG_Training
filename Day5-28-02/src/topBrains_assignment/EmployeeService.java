package topBrains_assignment;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

	

	// Ques1
	public Double avgSalary() {

		Double avgSal = EmployeeRepository.getEmployees().stream().map(e -> e.getSalary())
				.collect(Collectors.averagingDouble(e -> e));
		return avgSal;
	}

	// Ques 2
	public Map<Department, Employee> maxSalaryPerDepartment() {
		Map<Department,Employee> m = EmployeeRepository.getEmployees().stream()
	            .filter(e -> e.getDepartment() != null)
	            .collect(Collectors.groupingBy(
	                    Employee::getDepartment,
	                    Collectors.collectingAndThen(
	                            Collectors.maxBy(
	                                    Comparator.comparing(Employee::getSalary)
	                            ),
	                            Optional::get
	                    )
	            ));

	    return m;
	}
	
	//Ques3
	
	public Map<Department, Double> totalSalaryPerDepartment() {

		Map<Department,Double> m = EmployeeRepository.getEmployees().stream()
	            .filter(e -> e.getDepartment() != null)
	            .collect(Collectors.groupingBy(
	                    Employee::getDepartment,
	                    Collectors.summingDouble(Employee::getSalary)
	            ));
		return m;
	}
	
	// Ques4
	public Map<String, Double> display() {
	    Map<String, Double> m = EmployeeRepository.getEmployees().stream()
	            .collect(Collectors.toMap(
	                    Employee::getFirstName,
	                    Employee::getSalary
	            )); 
	    return m;
	}
	
	//Ques5
	
	public List<Double> sortedSal(){
		List<Double> li = EmployeeRepository.getEmployees().stream().sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())).map(e->e.getSalary()).collect(Collectors.toList());
		return li;
	}

}
