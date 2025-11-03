package epam.tasks.coreJava_task1;

public class Electronics extends Product {
	private double warrantyFee;

    public Electronics(String productId, String name, double price, int quantityOnHand, double warrantyFee) {
        super(productId, name, price, quantityOnHand);
        this.warrantyFee = warrantyFee;
    }

    @Override
    public double calculatePrice() {
        return price + warrantyFee; // Price includes warranty fee
    }
}
