package epam.tasks.coreJava_task2;

public class MainDriver {
	public static void main(String[] args) {
        // Create dealership
        Dealership dealership = new Dealership();

        // Create different vehicles
        Vehicle car = new Car("Toyota", "Corolla", 4);
        Vehicle truck = new Truck("Volvo", 15.0);
        Vehicle bike = new Motorcycle("Yamaha", 600);

        // Add to dealership inventory
        dealership.addVehicle(car);
        dealership.addVehicle(truck);
        dealership.addVehicle(bike);

        // Show all vehicles
        dealership.showAllVehicles();

        // Demonstrate polymorphic behavior
        car.start();
        truck.start();
        bike.start();

        car.stop();
        truck.stop();
        bike.stop();

        // Service all vehicles
        dealership.serviceAllVehicles();
    }
}
