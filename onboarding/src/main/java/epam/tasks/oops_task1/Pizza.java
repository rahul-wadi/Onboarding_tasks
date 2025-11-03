package epam.tasks.oops_task1;

import java.util.List;

public class Pizza {
	private Base base;
    private List<Topping> toppings;

    public Pizza(Base base, List<Topping> toppings) {
        this.base = base;
        this.toppings = toppings;
    }

    // Calculate total cost of the pizza
    public double calculateCost() {
        double totalCost = base.getCost();
        for (Topping topping : toppings) {
            totalCost = totalCost + topping.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder pizzaDetails = new StringBuilder();
        pizzaDetails.append("Base: ").append(base.getType()).append("\n");
        pizzaDetails.append("Toppings: ");
        for (Topping topping : toppings) {
            pizzaDetails.append(topping.getName()).append(" ");
        }
        pizzaDetails.append("\nTotal Cost: ").append(calculateCost());
        return pizzaDetails.toString();
    }
}
