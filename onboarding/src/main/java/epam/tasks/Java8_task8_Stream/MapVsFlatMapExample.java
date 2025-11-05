package epam.tasks.Java8_task8_Stream;

import java.util.*;
import java.util.stream.*;

public class MapVsFlatMapExample {

	 public static void main(String[] args) {
	        List<String> sentences = Arrays.asList(
	            "Java is powerful",
	            "Streams are cool",
	            "Map and FlatMap"
	        );

	        Stream<Stream<String>> mappedStream = sentences.stream()
	                .map(sentence -> Arrays.stream(sentence.split(" ")));

	        System.out.println("Using map():");
	        mappedStream.forEach(innerStream -> 
	            System.out.println(innerStream.collect(Collectors.toList()))
	        );

	        List<String> flatMappedList = sentences.stream()
	                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
	                .collect(Collectors.toList());

	        System.out.println("\nUsing flatMap():");
	        System.out.println(flatMappedList);
	    }
}
