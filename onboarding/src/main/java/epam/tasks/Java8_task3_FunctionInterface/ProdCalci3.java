package epam.tasks.Java8_task3_FunctionInterface;

import java.util.*;

public class ProdCalci3 {

	public static double calculateElectronicCost(List<Product> products) {
        double totalCost = 0.0;
        for (Product p : products) {
            if (p.getCategory().equalsIgnoreCase("Electronics")) {
                totalCost += p.getPrice();
            }
        }
        return totalCost;
    }

    // Main method to test
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 40000, "Electronics", "A"));
        products.add(new Product("Laptop", 75000, "Electronics", "B"));
        products.add(new Product("Sofa", 30000, "Furniture", "A"));
        products.add(new Product("Headphones", 5000, "Electronics", "A"));

        double total = calculateElectronicCost(products);
        System.out.println("Total cost of all electronic products: ₹" + total);
    }
}
