package epam.tasks.Java8_task3_FunctionInterface;

import java.util.*;

public class ProductCalculator1 {

	public static double calculateTotalCost(List<Product> products) {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 65000, "Electronics", "A"));
        productList.add(new Product("Headphones", 2500, "Accessories", "B"));
        productList.add(new Product("Chair", 4500, "Furniture", "A"));

        double totalCost = calculateTotalCost(productList);
        System.out.println("Total cost of all products: ₹" + totalCost);
    }
}
