package epam.tasks.coreJava_task3_loops;

import java.util.*;

public class Char_count {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        input = input.toLowerCase();
        searchChar = Character.toLowerCase(searchChar);

        int count = 0;
        int i = 0;

        if (input.length() > 0) {
            do {
                if (input.charAt(i) == searchChar) {
                    count++;
                }
                i++;
            } while (i < input.length());
        }

        System.out.println("\nThe character '" + searchChar + "' appears " + count + " time(s) in the string.");

        scanner.close();
    }
}
