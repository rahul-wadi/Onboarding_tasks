package epam.tasks.coreJava_task1;

public abstract class Product {
	protected String productId;
    protected String name;
    protected double price;
    protected int quantityOnHand;

    public Product(String productId, String name, double price, int quantityOnHand) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void reduceStock(int quantity) {
        if (quantity <= quantityOnHand) {
            quantityOnHand -= quantity;
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return name + " (ID: " + productId + ", Price: $" + price + ")";
    }
}
