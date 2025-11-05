package epam.tasks.Java8_task7_ConstructorReference;

public class Driver {

	public static void main(String[] args) {
        EmployeeData factory = Employee::new;

        Employee emp1 = factory.create("Rahul Sharma", "HR123", 75000.50);
        Employee emp2 = factory.create("Anita Desai", "FIN456", 88000.75);

        emp1.display();
        System.out.println();
        emp2.display();
    }
}
