package epam.tasks.coreJava_task1;

import java.util.*;

public class ShoppingCart {
	private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    public void removeProduct(String productId) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(productId)) {
                iterator.remove();
                System.out.println(product.getName() + " removed from the cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        return total;
    }

    public void showCartItems() {
        System.out.println("\n Shopping Cart Items:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total Amount: $" + calculateTotal());
    }
}
