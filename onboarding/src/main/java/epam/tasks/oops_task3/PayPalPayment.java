package epam.tasks.oops_task3;

public class PayPalPayment extends PaymentMethod {
	private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean validatePaymentDetails() throws InvalidPaymentDetailsException {
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new InvalidPaymentDetailsException("Invalid email format.");
        }
        if (password == null || password.length() < 6) {
            throw new InvalidPaymentDetailsException("Password must be at least 6 characters long.");
        }
        return true;
    }

    @Override
    public void processPayment(double amount) throws InsufficientFundsException, InvalidPaymentDetailsException {
        if (validatePaymentDetails()) {
            if (amount <= 0) {
                throw new InsufficientFundsException("Invalid transaction amount.");
            }
            paymentStatus = "PayPal payment of $" + amount + " processed successfully.";
        }
    }
}
