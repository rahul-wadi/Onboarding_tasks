package epam.tasks.coreJava_task1;

public class EcommerceApp {
	public static void main(String[] args) {
        // Create some product objects
        Product laptop = new Electronics("E001", "Laptop", 800, 10, 50);
        Product tshirt = new Clothing("C001", "T-Shirt", 40, 20, 0.1);
        Product apple = new Grocery("G001", "Apple", 2, 100, true);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products
        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(apple);

        // Show current cart
        cart.showCartItems();

        // Remove one product
        cart.removeProduct("C001");

        // Show updated cart
        cart.showCartItems();
    }
}
