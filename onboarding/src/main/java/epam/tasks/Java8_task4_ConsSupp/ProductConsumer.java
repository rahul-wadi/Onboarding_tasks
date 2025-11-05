package epam.tasks.Java8_task4_ConsSupp;

import java.util.*;
import java.util.function.Consumer;

public class ProductConsumer {

	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 55000, "Electronics", "A"),
            new Product("Shoes", 2500, "Fashion", "B"),
            new Product("Smartphone", 32000, "Electronics", "A"),
            new Product("Book", 450, "Stationery", "C")
        );

        Consumer<Product> updateNameIfExpensive = product -> {
            if (product.getPrice() > 3000) {
                product.setName(product.getName() + "*");
                System.out.println(product.getName());
            }
        };

        products.forEach(updateNameIfExpensive);
    }
}
