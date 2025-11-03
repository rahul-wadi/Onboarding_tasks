package epam.tasks.oops_task3;

public class Mainaccount {
	public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Create payment methods
        PaymentMethod creditCard = new CreditCardPayment("1234567812345678", "12/26", "123");
        PaymentMethod paypal = new PayPalPayment("user@example.com", "securepass");
        PaymentMethod bankTransfer = new BankTransfer("987654321098", "National Bank");

        // Process different payments
        processor.process(creditCard, 250.00);
        processor.process(paypal, 100.00);
        processor.process(bankTransfer, 500.00);

        // Example of invalid payment
        PaymentMethod invalidCard = new CreditCardPayment("123", "13/50", "1");
        processor.process(invalidCard, 100.00);

        // Display transaction history
        System.out.println("\nTransaction History:");
        for (String record : processor.getTransactionHistory()) {
            System.out.println(record);
        }
    }
}
