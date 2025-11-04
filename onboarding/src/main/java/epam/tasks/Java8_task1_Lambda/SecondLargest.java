package epam.tasks.Java8_task1_Lambda;

import java.util.*;

public class SecondLargest {

	public class SecondLargestWithLambda {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(45, 12, 78, 34, 89, 23, 56);

	        int secondLargest = numbers.stream()
	                .distinct() // remove duplicates
	                .sorted((a, b) -> b - a) // sort in descending order using lambda
	                .skip(1) // skip the first (largest)
	                .findFirst() // get the next one
	                .get();

	        System.out.println("Second largest number: " + secondLargest);
	    }
	}
}
