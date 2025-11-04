package epam.tasks.Java8_task1_Lambda;

public class Employee {

	public String name;
    public int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
