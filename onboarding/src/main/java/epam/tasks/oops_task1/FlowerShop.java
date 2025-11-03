package epam.tasks.oops_task1;



public class FlowerShop {
	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet();

        // Add flowers to the bouquet
        bouquet.addFlower(new Rose());
        bouquet.addFlower(new Jasmine());
        bouquet.addFlower(new Jasmine());
        bouquet.addFlower(new Lily());

        // Display total cost
        System.out.println("Total cost of the bouquet: $" + bouquet.calculateTotalCost());
    }
}
