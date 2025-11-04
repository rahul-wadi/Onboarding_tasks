package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.stream.*;

public class ProductAndFilter1 {

	public static void main(String[] args) {
        // Create sample product list
        List<Product> products = Arrays.asList(
                new Product("Earphones", 99.0, "Electronics", "A"),
                new Product("Charger", 150.0, "Electronics", "B"),
                new Product("Notebook", 50.0, "Stationery", "A"),
                new Product("USB Cable", 75.0, "Electronics", "A"),
                new Product("T-shirt", 300.0, "Apparel", "B")
        );

        // Predicate: price < 100 and category == "Electronics"
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getPrice() < 100 && p.getCategory().equalsIgnoreCase("Electronics"))
                .collect(Collectors.toList());
        
        System.out.println("Products with price < 100 and category = electronics:");
        filteredProducts.forEach(System.out::println);
    }
}
