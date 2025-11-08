package epam.tasks.Collections_task11_Grade;

import java.util.*;

public class GradeManagementSystem {

	private TreeMap<Integer, Student> students;

    public GradeManagementSystem() {
        students = new TreeMap<>();
    }

    public void addStudent(int id, String name, ArrayList<Double> grades) {
        students.put(id, new Student(name, grades));
        System.out.println("Added Student: " + name + " (ID: " + id + ")");
    }

    public void updateGrades(int id, ArrayList<Double> newGrades) {
        Student student = students.get(id);
        if (student != null) {
            student.setGrades(newGrades);
            System.out.println("Updated grades for " + student.getName());
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void printAverageGrade(int id) {
        Student student = students.get(id);
        if (student != null) {
            double avg = student.getAverageGrade();
            System.out.println("Average grade for " + student.getName() + ": " + avg);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void printAllStudents() {
        System.out.println("\nAll Students:");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
