package epam.tasks.Java8_task4_ConsSupp;

import java.util.*;
import java.util.function.*;

public class RandomSupplier {

	public static void main(String[] args) {
        Supplier<Product> productSupplier = createRandomProductSupplier();

        // Generate 5 random products
        for (int i = 0; i < 5; i++) {
            System.out.println(productSupplier.get());
        }
    }

    private static Supplier<Product> createRandomProductSupplier() {
        Random random = new Random();

        List<String> names = Arrays.asList("Laptop", "Phone", "Tablet", "Camera", "Headphones");
        List<String> categories = Arrays.asList("Electronics", "Accessories", "Appliances");
        List<String> grades = Arrays.asList("A", "B", "C");

        return () -> {
            String name = names.get(random.nextInt(names.size()));
            double price = 50 + (5000 - 50) * random.nextDouble();
            String category = categories.get(random.nextInt(categories.size()));
            String grade = grades.get(random.nextInt(grades.size()));
            return new Product(name, price, category, grade);
        };
    }
}
