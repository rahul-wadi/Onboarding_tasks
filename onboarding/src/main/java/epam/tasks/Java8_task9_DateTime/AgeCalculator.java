package epam.tasks.Java8_task9_DateTime;

import java.time.*;
import java.util.*;

public class AgeCalculator {

	public static int calculateAge(LocalDate birthDate) {
		LocalDate currentDate = LocalDate.now();
		if (birthDate != null && !birthDate.isAfter(currentDate)) {
			return Period.between(birthDate, currentDate).getYears();
		} else {
			throw new IllegalArgumentException("Invalid birth date.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get user input
		System.out.print("Enter your date of birth (YYYY-MM-DD): ");
		String input = scanner.nextLine();

		// Parse the input date
		LocalDate birthDate = LocalDate.parse(input);

		// Calculate and display age
		int age = calculateAge(birthDate);
		System.out.println("You are " + age + " years old.");

		scanner.close();
	}
}
