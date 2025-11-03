package epam.tasks.coreJava_task4_Arraystrings;

import java.util.Scanner;

public class Pyramid_Number {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get user input
	        System.out.print("Enter the number of levels for the pyramid: ");
	        int levels = scanner.nextInt();

	        System.out.println("\nNumber Pyramid Pattern:\n");

	        // Outer loop for levels (rows)
	        for (int i = 1; i <= levels; i++) {
	            // Print leading spaces to center the pyramid
	            for (int j = i; j < levels; j++) {
	                System.out.print(" ");
	            }

	            // Print numbers in increasing order
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Print numbers in decreasing order
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        scanner.close();
	    }
}
