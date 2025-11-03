package epam.tasks.coreJava_task1;

public class SavingsAccount extends Account {
	private double interestRate; 

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds in Savings Account " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account " + accountNumber);
        }
    }

    // Apply interest to balance
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $" + interest + " applied to Savings Account " + accountNumber);
    }
}
