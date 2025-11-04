package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.function.*;

public class PriceOrProduct {

	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 55000, "Electronics", "A"),
                new Product("Chair", 85, "Furniture", "B"),
                new Product("Mobile", 25000, "Electronics", "A"),
                new Product("Notebook", 40, "Stationery", "C"),
                new Product("Mixer", 120, "Appliances", "B")
        );

        // Predicate: price > 100 OR category = "Electronics"
        Predicate<Product> condition = 
                p -> p.getPrice() > 100 || p.getCategory().equalsIgnoreCase("Electronics");

        // Filter and print matching products
        products.stream()
                .filter(condition)
                .forEach(System.out::println);
    }
}
