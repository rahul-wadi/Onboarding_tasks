package epam.tasks.Java8_task8_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalStream {

	public static void main(String[] args) {
		List<Optional<String>> namesOptional = Arrays.asList(
				Optional.of("John"),
				Optional.empty(),
				Optional.of("Jane"),
				Optional.empty()
				);

		List<String> names = namesOptional.stream()
				.filter(Optional::isPresent)         
				.map(Optional::get)                   
				.collect(Collectors.toList());        

		System.out.println(names); //[John, Jane]
	}
}
