package epam.tasks.Java8_task8_Stream;

import java.time.*;
import java.time.temporal.*;

public class NewYear {

	public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Get New Year's Day of the next year
        LocalDate nextNewYear = LocalDate.of(today.getYear() + 1, 1, 1);
        
        // Calculate number of days between today and next New Year's Day
        long daysUntilNewYear = ChronoUnit.DAYS.between(today, nextNewYear);
        
        System.out.println("Days until New Year: " + daysUntilNewYear);
    }
}
