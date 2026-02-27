package streamAssignment;

import java.util.Iterator;
import java.util.List;

public class EmployeeMain {
	public static void main() {
		EmployeeService eS = new EmployeeService();
		
//		System.out.println(eS.totalSal());
//		System.out.println(eS.countInDep());
//		List<DurationEmp> d = eS.duration();
		
		List<Department> d = eS.depWithoutEmployees();
		
		for (Iterator<Department> iterator = d.iterator(); iterator.hasNext();) {
			Department department = (Department) iterator.next();
			System.out.println(department.getDepartmentName());
			
		}
		
	}

}
