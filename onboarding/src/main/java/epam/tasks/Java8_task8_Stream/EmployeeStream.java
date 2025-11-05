package epam.tasks.Java8_task8_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Rahul", 28, "IT", 80000),
				new Employee("Neha", 32, "HR", 60000),
				new Employee("Amit", 26, "IT", 90000),
				new Employee("Priya", 30, "Finance", 75000),
				new Employee("Karan", 35, "IT", 85000)
				);

		List<String> itEmployeeNames = employees.stream()
				.filter(e -> "IT".equalsIgnoreCase(e.getDepartment()))                 
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())   
				.map(Employee::getName)                                               
				.collect(Collectors.toList());                                        

		System.out.println("IT Employees sorted by salary (desc): " + itEmployeeNames);
	}
}
