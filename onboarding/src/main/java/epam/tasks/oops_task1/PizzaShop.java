package epam.tasks.oops_task1;

import java.util.List;

public class PizzaShop {
	public static void main(String[] args) {
        // Create base types
        Base standardBase = new Base("Standard", 5.0);
        Base softBase = new Base("Soft", 6.0);

        // Create toppings
        Topping tomato = new Topping("Tomato", 1.5);
        Topping corn = new Topping("Corn", 1.0);
        Topping mushrooms = new Topping("Mushrooms", 1.2);

        // Create a pizza with standard base and selected toppings
        List<Topping> selectedToppings = List.of(tomato, corn, mushrooms);
        Pizza pizza = new Pizza(standardBase, selectedToppings);

        // Calculate and display pizza details
        System.out.println(pizza);
    }
}
