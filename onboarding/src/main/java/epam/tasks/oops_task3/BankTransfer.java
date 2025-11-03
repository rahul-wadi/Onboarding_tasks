package epam.tasks.oops_task3;

public class BankTransfer extends PaymentMethod {
	private String accountNumber;
    private String bankName;

    public BankTransfer(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public boolean validatePaymentDetails() throws InvalidPaymentDetailsException {
        if (!accountNumber.matches("\\d{10,18}")) {
            throw new InvalidPaymentDetailsException("Invalid account number format.");
        }
        if (bankName == null || bankName.isEmpty()) {
            throw new InvalidPaymentDetailsException("Bank name cannot be empty.");
        }
        return true;
    }

    @Override
    public void processPayment(double amount) throws InsufficientFundsException, InvalidPaymentDetailsException {
        if (validatePaymentDetails()) {
            if (amount <= 0) {
                throw new InsufficientFundsException("Invalid transaction amount.");
            }
            paymentStatus = "Bank transfer of $" + amount + " processed successfully.";
        }
    }
}
