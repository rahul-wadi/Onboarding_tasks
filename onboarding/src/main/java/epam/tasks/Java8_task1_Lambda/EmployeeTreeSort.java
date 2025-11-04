package epam.tasks.Java8_task1_Lambda;

import java.util.*;

public class EmployeeTreeSort {

	public static void main(String[] args) {

        // TreeSet with custom comparator using Lambda expression
        TreeSet<Employee> employees = new TreeSet<>
         ((e1, e2) -> (e1.name).compareToIgnoreCase(e2.name));

        // Adding employees directly (no Scanner used)
        employees.add(new Employee("Rahul", 101));
        employees.add(new Employee("Anita", 102));
        employees.add(new Employee("Vikram", 103));
        employees.add(new Employee("Meera", 104));

        // Displaying sorted employees
        System.out.println("Employees sorted alphabetically by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
