package epam.tasks.Java8_task2_Predicates;

import java.util.*;

public class Json400 {

	 public static void main(String[] args) {
	        List<Response> responses = Arrays.asList(
	                new Response("{\"message\":\"Bad Request\"}", 400, "JSON"),
	                new Response("<html>Error</html>", 400, "HTML"),
	                new Response("{\"message\":\"Success\"}", 200, "JSON"),
	                new Response("{\"error\":\"Invalid Input\"}", 400, "JSON")
	        );

	        System.out.println("Responses with status code 400 and response type JSON:\n");

	        // Predicate + Stream filtering
	        responses.stream()
	                .filter(r -> r.getStatusCode() == 400 && "JSON".equalsIgnoreCase(r.getResponseType()))
	                .forEach(System.out::println);
	    }
}
