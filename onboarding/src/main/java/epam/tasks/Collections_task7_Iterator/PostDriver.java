package epam.tasks.Collections_task7_Iterator;

public class PostDriver {

	public static void main(String[] args) {
        NewPostOffice office = new NewPostOffice();
        office.addBox("Alice", "Bob", 2.5, 0.1, 200);
        office.addBox("Charlie", "Bob", 5.0, 0.15, 500);
        office.addBox("Diana", "Eve", 1.0, 0.05, 100);

        System.out.println("All parcels:");
        for (Box b : office.getListBox()) {
            System.out.println(b);
        }

        System.out.println("\nDelivering to Bob...");
        for (Box b : office.deliveryBoxToRecipient("Bob")) {
            System.out.println("Delivered: " + b);
        }

        System.out.println("\nRemaining parcels:");
        for (Box b : office.getListBox()) {
            System.out.println(b);
        }

        office.declineCostOfBox(10);
        System.out.println("\nAfter 10% cost decline:");
        for (Box b : office.getListBox()) {
            System.out.println(b);
        }
    }
}
