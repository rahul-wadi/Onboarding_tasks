package epam.tasks.coreJava_task1;

public class Grocery extends Product {
	private boolean isPerishable;

    public Grocery(String productId, String name, double price, int quantityOnHand, boolean isPerishable) {
        super(productId, name, price, quantityOnHand);
        this.isPerishable = isPerishable;
    }

    @Override
    public double calculatePrice() {
        if (isPerishable) {
            return price * 0.9; // 10% discount for perishables
        }
        return price;
    }
}
