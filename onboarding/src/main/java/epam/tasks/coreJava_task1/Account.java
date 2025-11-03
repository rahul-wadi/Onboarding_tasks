package epam.tasks.coreJava_task1;

public abstract class Account {
	protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit money into account
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    // Withdraw money (behavior may differ in subclasses)
    public abstract void withdraw(double amount);

    // Check balance
    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
