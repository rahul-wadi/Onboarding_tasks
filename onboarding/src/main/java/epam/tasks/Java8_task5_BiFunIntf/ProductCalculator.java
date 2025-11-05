package epam.tasks.Java8_task5_BiFunIntf;

import java.util.*;
import java.util.function.*;

public class ProductCalculator {

	public static void main(String[] args) {
        BiFunction<Product, Integer, Double> costCalculator = (product, quantity) -> product.getPrice() * quantity;

        Product p1 = new Product("Laptop", 75000, "Electronics", "A");
        Product p2 = new Product("Headphones", 2500, "Accessories", "B");
        Product p3 = new Product("Keyboard", 1200, "Accessories", "B");

        Map<Product, Integer> cart = new java.util.HashMap<>();
        cart.put(p1, 1);
        cart.put(p2, 2);
        cart.put(p3, 3);

        double totalCost = cart.entrySet().stream()
                .mapToDouble(entry -> costCalculator.apply(entry.getKey(), entry.getValue()))
                .sum();

        System.out.println("Cart Items:");
        cart.forEach((prod, qty) -> System.out.println(prod + " x " + qty));
        System.out.println("\n Total Cart Cost: ₹" + totalCost);
    }
}
