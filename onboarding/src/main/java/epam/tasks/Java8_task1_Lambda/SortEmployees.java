package epam.tasks.Java8_task1_Lambda;

import java.util.*;

public class SortEmployees {

	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rahul", 101));
        employees.add(new Employee("Amit", 102));
        employees.add(new Employee("Neha", 103));
        employees.add(new Employee("Sonia", 104));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        // Sort in descending order by name using lambda
        Collections.sort(employees, (e1, e2) -> e2.name.compareTo(e1.name));

        System.out.println("\nAfter Sorting (Descending by Name):");
        employees.forEach(System.out::println);
    }
}
