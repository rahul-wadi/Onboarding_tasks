package epam.tasks.Java8_task2_Predicates;

import java.util.*;
import java.util.function.*;

public class ProductFilterExample {

	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 55000, "Electronics", "A"),
                new Product("Mouse", 700, "Accessories", "B"),
                new Product("Mobile", 15000, "Electronics", "A"),
                new Product("Notebook", 80, "Stationery", "C")
        );

        // Predicate: Price greater than 1000
        Predicate<Product> isPriceGreaterThan1000 = product -> product.getPrice() > 1000;

        System.out.println("Products with price greater than 1000/-:");
        products.stream()
                .filter(isPriceGreaterThan1000)
                .forEach(System.out::println);
    }
}
