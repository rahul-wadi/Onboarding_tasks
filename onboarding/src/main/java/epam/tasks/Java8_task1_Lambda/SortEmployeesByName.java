package epam.tasks.Java8_task1_Lambda;

import java.util.*;

public class SortEmployeesByName {

	public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rahul", 103));
        employees.add(new Employee("Amit", 101));
        employees.add(new Employee("Sneha", 104));
        employees.add(new Employee("Karan", 102));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        // Sort using Comparator and Lambda
        employees.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        employees.forEach(System.out::println);
    }
}
