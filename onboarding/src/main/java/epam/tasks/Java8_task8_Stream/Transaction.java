package epam.tasks.Java8_task8_Stream;

public class Transaction {

	public double amount;
	public String currency;
	public String status;

    public Transaction(double amount, String currency, String status) {
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }
    public String getStatus() { return status; }
}
