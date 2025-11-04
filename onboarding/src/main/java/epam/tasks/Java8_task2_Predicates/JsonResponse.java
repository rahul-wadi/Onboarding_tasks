package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.function.*;

public class JsonResponse {

	public static void main(String[] args) {
        List<Response> responses = Arrays.asList(
                new Response("{'message':'OK'}", 200, "JSON"),
                new Response("<html>Not Found</html>", 404, "HTML"),
                new Response("{'error':'Unauthorized'}", 401, "JSON"),
                new Response("Plain text response", 500, "TEXT")
        );

        // Predicate: check if response type is JSON
        Predicate<Response> isJsonResponse = r -> r.getResponseType().equalsIgnoreCase("JSON");

        System.out.println("Responses with response type JSON:");
        responses.stream()
                .filter(isJsonResponse)
                .forEach(System.out::println);
    }
}
