package epam.tasks.coreJava_task2;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza(String size) {
        super(size, "Pan Crust");
        toppings.add("Cheese");
        toppings.add("Pepperoni");
    }

    @Override
    public double getCost() {
        double baseCost = 6.5;
        return baseCost + (size.equals("Large") ? 3.5 : 0);
    }
}
