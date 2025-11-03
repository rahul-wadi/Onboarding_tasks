package epam.tasks.oops_task3;

public abstract class PaymentMethod {
	protected String paymentStatus = "Pending";

    public abstract void processPayment(double amount) throws InsufficientFundsException, InvalidPaymentDetailsException;

    public abstract boolean validatePaymentDetails() throws InvalidPaymentDetailsException;

    public String getPaymentStatus() {
        return paymentStatus;
    }
}
