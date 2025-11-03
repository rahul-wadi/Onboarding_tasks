package epam.tasks.oops_task3;

public class CreditCardPayment extends PaymentMethod {
	private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean validatePaymentDetails() throws InvalidPaymentDetailsException {
        if (!cardNumber.matches("\\d{16}")) {
            throw new InvalidPaymentDetailsException("Invalid card number format.");
        }
        if (!expiryDate.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            throw new InvalidPaymentDetailsException("Invalid expiry date format (MM/YY expected).");
        }
        if (!cvv.matches("\\d{3}")) {
            throw new InvalidPaymentDetailsException("Invalid CVV format.");
        }
        return true;
    }

    @Override
    public void processPayment(double amount) throws InsufficientFundsException, InvalidPaymentDetailsException {
        if (validatePaymentDetails()) {
            if (amount <= 0) {
                throw new InsufficientFundsException("Invalid transaction amount.");
            }
            // Simulate successful transaction
            paymentStatus = "Credit Card payment of $" + amount + " processed successfully.";
        }
    }
}
