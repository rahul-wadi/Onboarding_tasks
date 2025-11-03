package epam.tasks.coreJava_task2;

public class Motorcycle implements Vehicle{
	private String brand;
    private int engineCC;
    private int numberOfWheels;

    public Motorcycle(String brand, int engineCC) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.numberOfWheels = 2;
    }

    @Override
    public void start() {
        System.out.println(brand + " Motorcycle (" + engineCC + "cc) started.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " Motorcycle stopped.");
    }

    @Override
    public void service() {
        System.out.println("Servicing " + brand + " Motorcycle - Chain lubrication and engine check.");
    }

    @Override
    public String toString() {
        return "Motorcycle [Brand=" + brand + ", Engine=" + engineCC + "cc, Wheels=" + numberOfWheels + "]";
    }
}	
