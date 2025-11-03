package epam.tasks.coreJava_task3_loops;

import java.util.*;

public class CharPrint {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        scanner.close();
    }
}
