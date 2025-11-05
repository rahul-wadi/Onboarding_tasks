package epam.tasks.Java8_task7_ConstructorReference;

public class Employee {

	public String name;
	public String account;
	public double salary;

    public Employee(String name, String account, double salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name    : " + name);
        System.out.println("Account : " + account);
        System.out.println("Salary  : " + salary);
    }
}
