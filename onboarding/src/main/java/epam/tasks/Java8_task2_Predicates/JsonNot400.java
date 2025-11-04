package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.function.*;

public class JsonNot400 {

	public static void main(String[] args) {
		List<Response> responses = Arrays.asList(
				new Response("{'id':1}", 200, "JSON"),
				new Response("Bad Request", 400, "TEXT"),
				new Response("{'id':2}", 201, "JSON"),
				new Response("<html>OK</html>", 200, "HTML"),
				new Response("{'error': 'none'}", 404, "JSON")
				);

		// Define predicate
		Predicate<Response> validResponse = r ->
		r.getStatusCode() != 400 && r.getResponseType().equalsIgnoreCase("JSON");

		// Print filtered responses
		System.out.println("Responses with status code != 400 and response type JSON:");
		responses.stream()
		.filter(validResponse)
		.forEach(System.out::println);
	}
}
