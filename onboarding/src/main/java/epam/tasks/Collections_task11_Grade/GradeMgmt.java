package epam.tasks.Collections_task11_Grade;

import java.util.*;

public class GradeMgmt {

	public static void main(String[] args) {
        GradeManagementSystem system = new GradeManagementSystem();

        ArrayList<Double> aliceGrades = new ArrayList<>();
        aliceGrades.add(85.0);
        aliceGrades.add(90.0);
        aliceGrades.add(78.0);

        ArrayList<Double> bobGrades = new ArrayList<>();
        bobGrades.add(88.0);
        bobGrades.add(92.0);
        bobGrades.add(80.0);

        system.addStudent(1, "Alice", aliceGrades);
        system.addStudent(2, "Bob", bobGrades);
        system.printAllStudents();

        ArrayList<Double> newAliceGrades = new ArrayList<>();
        newAliceGrades.add(87.0);
        newAliceGrades.add(91.0);
        newAliceGrades.add(82.0);
        system.updateGrades(1, newAliceGrades);
        system.printAverageGrade(1); // Alice
        system.printAverageGrade(2); // Bob
    }
}
