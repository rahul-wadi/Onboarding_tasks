package epam.tasks.Java8_task1_Lambda;

import java.util.*;

public class Reverse {

	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 30, 25);

	        Collections.sort(numbers, (a, b) -> b - a);
	      
	        System.out.println("Numbers sorted in reverse order: " + numbers);
	    }
}
