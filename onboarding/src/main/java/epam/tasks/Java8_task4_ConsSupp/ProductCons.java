package epam.tasks.Java8_task4_ConsSupp;

import java.util.*;
import java.util.function.*;

public class ProductCons {

	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1500, "Electronics", "Standard"),
                new Product("Pen", 50, "Stationery", "Standard"),
                new Product("Smartphone", 1200, "Electronics", "Standard"),
                new Product("Book", 400, "Stationery", "Standard")
        );

        Consumer<Product> updateGrade = product -> {
            if (product.getPrice() > 1000) {
                product.setGrade("Premium");
                System.out.println(product.getName());
            }
        };

        products.forEach(updateGrade);
    }
}
