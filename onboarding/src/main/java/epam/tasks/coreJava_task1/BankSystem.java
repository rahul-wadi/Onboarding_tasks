package epam.tasks.coreJava_task1;

public class BankSystem {
	public static void main(String[] args) {
		// Create accounts
		SavingsAccount savings = new SavingsAccount("SA-101", 1000.0, 0.05);
		CheckingAccount checking = new CheckingAccount("CA-202", 500.0, 200.0);

		// Perform operations
		savings.deposit(200.0);
		savings.withdraw(100.0);
		savings.applyInterest();
		System.out.println("Savings Balance: $" + savings.checkBalance());
		System.out.println();

		checking.deposit(300.0);
		checking.withdraw(900.0);  // Within overdraft limit
		checking.withdraw(200.0);  // Exceeds overdraft limit
		System.out.println("Checking Balance: $" + checking.checkBalance());
	}
}
