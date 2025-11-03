package epam.tasks.coreJava_task3_loops;

import java.util.*;

public class Reverse_Word {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string to reverse: ");
		String input = scanner.nextLine();

		if (input.isEmpty()) {
			System.out.println("You entered an empty string. Nothing to reverse!");
		} 
		else if (input.length() == 1) {
			System.out.println("The string has only one character: " + input);
		} 
		else {
			String reversed = "";
			for (int i = input.length() - 1; i >= 0; i--) {
				reversed += input.charAt(i);
			}
			System.out.println("Reversed string: " + reversed);
		}

		scanner.close();
	}
}
