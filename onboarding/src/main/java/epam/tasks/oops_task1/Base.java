package epam.tasks.oops_task1;

public class Base {
	private String type;
    private double cost;

    public Base(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }
}
