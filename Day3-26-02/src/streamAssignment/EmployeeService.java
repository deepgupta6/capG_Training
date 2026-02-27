package streamAssignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

	//Ques1
	public double totalSal() {

		double totalSal = EmployeeRepository.getEmployees().stream().map(e -> e.getSalary())
				.collect(Collectors.summingDouble(e -> e));
		return totalSal;
	}

	//Ques2
	public Map<String, Long> countInDep() {
		Map<String, Long> m = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment().getDepartmentName())
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		return m;
	}

	//Ques3
	public Employee seniorMost() {
		Employee e = EmployeeRepository.getEmployees().stream()
				.min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate())).get();
		return e;
	}

	//Ques4
	public List<DurationEmp> duration() {

		List<DurationEmp> d = EmployeeRepository.getEmployees().stream().map(e -> {
			DurationEmp dur = new DurationEmp();
			dur.seteFirstName(e.getFirstName());
			dur.eLastName = e.getLastName();
			Period p = Period.between(e.getHireDate(), LocalDate.now());
			dur.months = p.getMonths();
			dur.days = p.getDays();
			return dur;
		}).collect(Collectors.toList());
		return d;

	}

	//Ques5
	public List<Employee> empWithoutDep() {

		List<Employee> emp = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() == null)
				.collect(Collectors.toList());
		return emp;
	}

	//Ques6
	public List<Department> depWithoutEmployees() {

		List<Department> d = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
		
		return EmployeeRepository.getDepartments().stream()
		        .filter(dept -> !d.contains(dept))
		        .collect(Collectors.toList());
	}

	//Ques7
	public Department highestEmployee() {
		Department d = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment()).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
				.stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
		return d;
	}

}
