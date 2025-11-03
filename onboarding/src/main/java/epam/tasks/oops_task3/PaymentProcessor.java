package epam.tasks.oops_task3;

import java.util.*;

public class PaymentProcessor {
	private List<String> transactionHistory = new ArrayList<>();

    public void process(PaymentMethod paymentMethod, double amount) {
        try {
            paymentMethod.processPayment(amount);
            System.out.println(paymentMethod.getPaymentStatus());
            transactionHistory.add(paymentMethod.getPaymentStatus());
        } catch (InvalidPaymentDetailsException | InsufficientFundsException e) {
            System.out.println("Payment failed: " + e.getMessage());
            transactionHistory.add("Failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}
