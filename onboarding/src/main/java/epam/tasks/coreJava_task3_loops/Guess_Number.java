package epam.tasks.coreJava_task3_loops;

import java.util.*;

public class Guess_Number {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        final int MAX_ATTEMPTS = 7;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

        // Game loop using do-while
        do {
            System.out.print("\n Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
                break; // Exit loop if correct
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("\n Sorry! You've used all " + MAX_ATTEMPTS + " attempts.");
                System.out.println("The correct number was: " + secretNumber);
                break;
            }

        } while (guess != secretNumber);

        scanner.close();
    }
}
