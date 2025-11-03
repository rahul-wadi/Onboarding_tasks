package epam.tasks.coreJava_task2;

import java.util.*;

public class Dealership {
	private List<Vehicle> inventory = new java.util.ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
        System.out.println("Added to inventory: " + vehicle.toString());
    }

    public void showAllVehicles() {
        System.out.println("\n--- Dealership Inventory ---");
        for (Vehicle v : inventory) {
            System.out.println(v.toString());
        }
        System.out.println("-----------------------------");
    }

    public void serviceAllVehicles() {
        System.out.println("\n--- Servicing All Vehicles ---");
        for (Vehicle v : inventory) {
            v.service();
        }
        System.out.println("------------------------------");
    }
}
