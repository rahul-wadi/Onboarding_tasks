package epam.tasks.coreJava_task2;

public class Truck implements Vehicle {
	private String brand;
    private double loadCapacity; // in tons
    private int numberOfWheels;

    public Truck(String brand, double loadCapacity) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
        this.numberOfWheels = 6; // Trucks usually have 6 wheels
    }

    @Override
    public void start() {
        System.out.println(brand + " Truck started. Ready to carry load.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " Truck stopped.");
    }

    @Override
    public void service() {
        System.out.println("Servicing " + brand + " Truck - Engine tuning and brake inspection.");
    }

    @Override
    public String toString() {
        return "Truck [Brand=" + brand + ", Load Capacity=" + loadCapacity + " tons, Wheels=" + numberOfWheels + "]";
    }
}
