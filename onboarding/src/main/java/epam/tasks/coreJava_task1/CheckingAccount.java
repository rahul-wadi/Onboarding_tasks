package epam.tasks.coreJava_task1;

public class CheckingAccount extends Account {
	private double transactionLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double transactionLimit) {
        super(accountNumber, initialBalance);
        this.transactionLimit = transactionLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > transactionLimit) {
            System.out.println("Transaction limit exceeded! Max allowed: $" + transactionLimit);
        } else if (amount > balance) {
            System.out.println("Insufficient funds in Checking Account " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account " + accountNumber);
        }
    }
}
