package epam.tasks.oops_task1;

import java.util.*;

public class Bouquet {
	private List<Flower> flowers;

	public Bouquet() {
		flowers = new ArrayList<>();
	}

	// Add a flower to the bouquet
	public void addFlower(Flower flower) {
		flowers.add(flower);
	}

	// Utility method to calculate total cost
	public double calculateTotalCost() {
		double total = 0.0;
		for (Flower f : flowers) {
			total += f.getCost();
		}
		return total;
	}
}
