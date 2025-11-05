package epam.tasks.Java8_task8_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortEmployees {

	public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", 55000),
            new Employee("Anita", 60000),
            new Employee("Vikram", 50000)
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        sortedEmployees.forEach(System.out::println);
    }
}
