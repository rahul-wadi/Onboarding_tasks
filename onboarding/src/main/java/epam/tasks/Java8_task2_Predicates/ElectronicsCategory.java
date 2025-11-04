package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.function.*;

public class ElectronicsCategory {

	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 75000, "Electronics", "A"),
            new Product("Shampoo", 250, "Personal Care", "B"),
            new Product("Smartphone", 60000, "Electronics", "A"),
            new Product("Refrigerator", 40000, "Electronics", "A"),
            new Product("Notebook", 50, "Stationery", "C")
        );

        // Predicate to check if product category is "Electronics"
        Predicate<Product> isElectronics = p -> p.getCategory().equalsIgnoreCase("Electronics");

        System.out.println("Products in Electronics Category:");
        products.stream()
                .filter(isElectronics)
                .forEach(System.out::println);
    }
}
