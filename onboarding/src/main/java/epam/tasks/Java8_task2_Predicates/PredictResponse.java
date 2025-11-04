package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.function.*;

public class PredictResponse {

	public static void main(String[] args) {
        List<Response> responses = Arrays.asList(
                new Response("Bad Request - Missing field", 400, "Error"),
                new Response("OK - Product added", 200, "Success"),
                new Response("Bad Request - Invalid price", 400, "Error"),
                new Response("Not Found", 404, "Error")
        );

        // Predicate to check if status code is 400
        Predicate<Response> isBadRequest = r -> r.getStatusCode() == 400;

        // Print all responses with status code 400
        System.out.println("Responses with status code 400:");
        responses.stream()
                 .filter(isBadRequest)
                 .forEach(System.out::println);
    }
}
