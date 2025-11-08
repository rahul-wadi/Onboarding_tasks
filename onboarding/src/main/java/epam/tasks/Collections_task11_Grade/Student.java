package epam.tasks.Collections_task11_Grade;

import java.util.*;

public class Student {

		public String name;
		public ArrayList<Double> grades;

	    public Student(String name, ArrayList<Double> grades) {
	        this.name = name;
	        this.grades = grades;
	    }

	    public String getName() {
	        return name;
	    }

	    public ArrayList<Double> getGrades() {
	        return grades;
	    }

	    public void setGrades(ArrayList<Double> grades) {
	        this.grades = grades;
	    }

	    public double getAverageGrade() {
	        if (grades.isEmpty()) return 0.0;
	        double sum = 0;
	        for (double grade : grades) {
	            sum += grade;
	        }
	        return sum / grades.size();
	    }

	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', grades=" + grades + '}';
	    }
}
