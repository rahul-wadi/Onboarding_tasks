package epam.tasks.Java8_task9_DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.*;

public class NextThursday {

	public static void main(String[] args) {
        Supplier<LocalDate> nextThursdaySupplier = () -> {
            LocalDate today = LocalDate.now();
            // Move forward until we reach Thursday
            return today.with(java.time.temporal.TemporalAdjusters.next(DayOfWeek.THURSDAY));
        };

        // Get and print the next Thursday date
        System.out.println("Next Thursday is on: " + nextThursdaySupplier.get());
    }
}
