package epam.tasks.Java8_task9_DateTime;

import java.time.*;
import java.util.function.*;

public class YesterdayCheck {

	public static void main(String[] args) {
		Predicate<LocalDate> isYesterday = date ->
		date.equals(LocalDate.now().minusDays(1));

		LocalDate testDate1 = LocalDate.now().minusDays(1); // Yesterday
		LocalDate testDate2 = LocalDate.now();              // Today
		LocalDate testDate3 = LocalDate.now().minusDays(2); // Day before yesterday

		System.out.println("Test 1 (Yesterday): " + isYesterday.test(testDate1)); // true
		System.out.println("Test 2 (Today): " + isYesterday.test(testDate2));     // false
		System.out.println("Test 3 (2 days ago): " + isYesterday.test(testDate3));// false
	}
}
