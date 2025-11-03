package epam.tasks.coreJava_task2;

public class Car implements Vehicle{
	private String brand;
	private String model;
    private int numberOfWheels;

    public Car(String brand, String model, int numberOfWheels) {
        this.model = model;
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void start() {
        System.out.println(model + " car is starting with key ignition.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " (Car) stopped.");
    }

    @Override
    public void service() {
        System.out.println("Servicing " + brand + " " + model + " (Car) - Oil change and tire check.");
    }

    @Override
    public String toString() {
        return "Car [Brand=" + brand + ", Model=" + model + ", Wheels=" + numberOfWheels + "]";
    }
}
