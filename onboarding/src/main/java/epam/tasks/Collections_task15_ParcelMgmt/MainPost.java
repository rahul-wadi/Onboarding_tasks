package epam.tasks.Collections_task15_ParcelMgmt;

import java.util.*;

public class MainPost {

	public static void main(String[] args) {
        List<Box> list = new ArrayList<Box>();
        list.add(new Box("A", "John", 5.0, 2.0, 100, "Kyiv", "Office1"));
        list.add(new Box("B", "Alice", 3.0, 1.5, 50, "Lviv", "Office2"));
        list.add(new Box("C", "John", 7.5, 2.2, 120, "Odessa", "Office3"));

        NewPostOfficeManagement office = new NewPostOfficeMagmtImpl(list);

        System.out.println("By ID (2): " + office.getBoxById(2));
        System.out.println("\nSorted by weight desc:\n" + office.getDescSortedBoxesByWeight());
        System.out.println("Sorted by cost asc:\n" + office.getAscSortedBoxesByCost());
        System.out.println("Boxes for John: " + office.getBoxesByRecipient("John"));
    }
}
