package epam.tasks.Collections_task10_Shop;

public class MainShop {

	public static void main(String[] args) {
        Shop shop = new Shop(5);

        System.out.println("Initial state");
        shop.print();
        System.out.println("==============");

        System.out.println("Enable cboxes 0, 2, 4");
        shop.setCashBoxState(0, CashBox.State.ENABLED);
        shop.setCashBoxState(2, CashBox.State.ENABLED);
        shop.setCashBoxState(4, CashBox.State.ENABLED);
        shop.print();
        System.out.println("==============");

        System.out.println("Add 5 buyers");
        // buyers A..E
        shop.addBuyer(new Buyer("A"));
        shop.addBuyer(new Buyer("B"));
        shop.addBuyer(new Buyer("C"));
        shop.addBuyer(new Buyer("D"));
        shop.addBuyer(new Buyer("E"));
        shop.print();
        System.out.println("==============");

        System.out.println("Add 8 buyers (total 13 buyers)");
        shop.addBuyer(new Buyer("F"));
        shop.addBuyer(new Buyer("G"));
        shop.addBuyer(new Buyer("H"));
        shop.addBuyer(new Buyer("I"));
        shop.addBuyer(new Buyer("J"));
        shop.addBuyer(new Buyer("K"));
        shop.addBuyer(new Buyer("L"));
        shop.addBuyer(new Buyer("M"));
        shop.print();
        System.out.println("==============");

        System.out.println("Set cbox #2 is closing");
        shop.setCashBoxState(2, CashBox.State.IS_CLOSING);
        shop.print();
        System.out.println("==============");

        System.out.println("Do 1 tact");
        shop.tact();
        shop.print();
        System.out.println("==============");

        System.out.println("Enable cbox #1, add 7 buyers");
        shop.setCashBoxState(1, CashBox.State.ENABLED);
        // add 7 buyers N..T
        shop.addBuyer(new Buyer("N"));
        shop.addBuyer(new Buyer("O"));
        shop.addBuyer(new Buyer("P"));
        shop.addBuyer(new Buyer("Q"));
        shop.addBuyer(new Buyer("R"));
        shop.addBuyer(new Buyer("S"));
        shop.addBuyer(new Buyer("T"));
        shop.print();
        System.out.println("==============");

        System.out.println("Enable cbox #3, do 1 tact");
        shop.setCashBoxState(3, CashBox.State.ENABLED);
        shop.tact();
        shop.print();
        System.out.println("==============");

        System.out.println("Do 1 tact");
        shop.tact();
        shop.print();
        System.out.println("==============");

        System.out.println("Do 1 tact");
        shop.tact();
        shop.print();
        System.out.println("==============");
    }
}
