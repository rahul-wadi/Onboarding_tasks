package epam.tasks.Java8_task1_Lambda;

import java.util.*;

public class EmployeeTreeMap {

	public static void main(String[] args) {
        TreeMap<String, String> employees = new TreeMap<>
           ((name1, name2) -> name2.compareTo(name1));
        employees.put("Rahul", "Manager");
        employees.put("Amit", "Developer");
        employees.put("Sneha", "Designer");
        employees.put("Karan", "Tester");
        employees.put("Priya", "HR");

        System.out.println("Employees sorted in descending order of their names:");
        employees.forEach((name, position) ->
            System.out.println("Name: " + name + ", Position: " + position)
        );
    }
}
