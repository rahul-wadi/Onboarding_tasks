package epam.tasks.coreJava_task2;

public class PizzaShop {
	public static void main(String[] args) {
        Pizza margherita = new MargheritaPizza("Medium");
        margherita.addTopping("Olives");
        margherita.showPizzaDetails();

        System.out.println();

        Pizza pepperoni = new PepperoniPizza("Large");
        pepperoni.addTopping("Extra Cheese");
        pepperoni.showPizzaDetails();
    }
}
