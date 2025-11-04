package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.stream.*;

public class ProductAndFilter {

	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 55000, "electronics", "A"),
            new Product("Shirt", 800, "clothing", "B"),
            new Product("Headphones", 1200, "electronics", "A"),
            new Product("Book", 250, "stationery", "A"),
            new Product("TV", 45000, "electronics", "B")
        );

        // Predicate: price > 100 and category = electronics
        List<Product> filteredProducts = products.stream()
            .filter(p -> p.getPrice() > 100 && p.getCategory().equalsIgnoreCase("electronics"))
            .collect(Collectors.toList());

        // Print the products that match the condition
        System.out.println("Products with price > 100 and category = electronics:");
        filteredProducts.forEach(System.out::println);
    }
}
