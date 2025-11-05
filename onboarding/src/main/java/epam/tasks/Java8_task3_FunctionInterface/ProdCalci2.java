package epam.tasks.Java8_task3_FunctionInterface;

import java.util.*;

public class ProdCalci2 {

	public static double calculateHighValueProductsCost(List<Product> products) {
        double totalCost = 0.0;

        for (Product product : products) {
            if (product.getPrice() > 1000) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Laptop", 55000, "Electronics", "A"));
        productList.add(new Product("Phone", 950, "Electronics", "B"));
        productList.add(new Product("TV", 30000, "Electronics", "A"));
        productList.add(new Product("Book", 450, "Stationery", "C"));
        productList.add(new Product("Chair", 1500, "Furniture", "B"));

        double total = calculateHighValueProductsCost(productList);

        System.out.println("Total cost of products priced above 1000: ₹" + total);
    }
}
