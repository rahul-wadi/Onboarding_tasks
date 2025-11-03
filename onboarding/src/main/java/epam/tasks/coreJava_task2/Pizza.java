package epam.tasks.coreJava_task2;

import java.util.*;

public abstract class Pizza {
	protected String size;
    protected String base;
    protected List<String> toppings = new ArrayList<>();

    public Pizza(String size, String base) {
        this.size = size;
        this.base = base;
    }

    public abstract double getCost();

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void showPizzaDetails() {
        System.out.println("Pizza Size: " + size);
        System.out.println("Base: " + base);
        System.out.println("Toppings: " + toppings);
        System.out.println("Total Cost: $" + getCost());
    }
}
