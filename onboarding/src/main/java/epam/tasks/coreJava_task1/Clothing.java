package epam.tasks.coreJava_task1;

public class Clothing extends Product {
	private double discountRate; // e.g., 0.10 = 10% discount

    public Clothing(String productId, String name, double price, int quantityOnHand, double discountRate) {
        super(productId, name, price, quantityOnHand);
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice() {
        return price * (1 - discountRate);
    }
}
