package epam.tasks.Java8_task9_DateTime;

import java.time.*;
import java.util.function.*;

public class CurrentTime {

	public static void main(String[] args) {
        Supplier<ZonedDateTime> estTimeSupplier = () -> 
                ZonedDateTime.now(ZoneId.of("America/New_York"));

        // Get current time
        ZonedDateTime currentTime = estTimeSupplier.get();

        System.out.println("Current time in EST: " + currentTime);
    }
}
