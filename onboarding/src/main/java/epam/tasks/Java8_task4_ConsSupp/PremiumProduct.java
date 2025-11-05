package epam.tasks.Java8_task4_ConsSupp;

import java.util.*;

public class PremiumProduct {

	public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Premium"),
            new Product("Headphones", "Standard"),
            new Product("Smartphone", "Premium"),
            new Product("Keyboard", "Basic"),
            new Product("Monitor", "Premium")
        );

        System.out.println("Premium grade products (with '*'):");
        
        for (Product p : products) {
            if (p.getGrade().equalsIgnoreCase("Premium")) {
                System.out.println(p.getName() + "*");
            }
        }
    }
}
