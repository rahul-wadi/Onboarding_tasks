package epam.tasks.Java8_task1_Lambda;

import java.util.stream.IntStream;

public class Pailndrome {

	 public static void main(String[] args) {
	        String str = "level";  // given string

	        boolean isPalindrome = IntStream.range(0, str.length() / 2)
	                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

	        if (isPalindrome)
	            System.out.println(str + " is a palindrome");
	        else
	            System.out.println(str + " is not a palindrome");
	    }
}
