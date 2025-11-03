package epam.tasks.coreJava_task2;

public class MargheritaPizza extends Pizza {
	public MargheritaPizza(String size) {
        super(size, "Thin Crust");
        toppings.add("Cheese");
        toppings.add("Tomato Sauce");
    }

    @Override
    public double getCost() {
        double baseCost = 5.0;
        return baseCost + (size.equals("Large") ? 3 : 0);
    }
}
