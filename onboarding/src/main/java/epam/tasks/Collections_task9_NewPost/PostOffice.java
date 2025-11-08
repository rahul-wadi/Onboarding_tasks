package epam.tasks.Collections_task9_NewPost;

import java.math.*;
import java.util.*;

public class PostOffice {

	public static void main(String[] args) {
        NewPostOfficeStorage storage = new NewPostOfficeStorageImpl();

        Box b1 = new Box("Alice", "Bob", 2.0, 0.5, new BigDecimal("100"), "Kyiv", 1);
        Box b2 = new Box("Mike", "John", 5.0, 1.2, new BigDecimal("250"), "Lviv", 2);
        Box b3 = new Box("Sara", "Anna", 1.5, 0.3, new BigDecimal("80"), "Odesa", 3);

        storage.acceptBox(b1);
        storage.acceptAllBoxes(Arrays.asList(b2, b3));

        System.out.println("Boxes with weight < 3:");
        for (Box b : storage.getAllWeightLessThan(3)) {
            System.out.println(b);
        }

        System.out.println("\nBoxes with cost > 100:");
        for (Box b : storage.getAllCostGreaterThan(new BigDecimal("100"))) {
            System.out.println(b);
        }

        System.out.println("\nUpdating office for Kyiv...");
        storage.updateOfficeNumber(box -> box.getCity().equals("Kyiv"), 9);

        System.out.println("\nAll boxes after update:");
        for (Box b : storage.searchBoxes(box -> true)) {
            System.out.println(b);
        }

        System.out.println("\nRemoving boxes with volume >= 1:");
        storage.carryOutBoxes(box -> box.getVolume() >= 1);

        System.out.println("\nRemaining boxes:");
        for (Box b : storage.searchBoxes(box -> true)) {
            System.out.println(b);
        }
    }
}
