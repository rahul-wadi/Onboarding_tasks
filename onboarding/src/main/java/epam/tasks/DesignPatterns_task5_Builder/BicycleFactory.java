package epam.tasks.DesignPatterns_task5_Builder;

public class BicycleFactory {

	public static void main(String[] args) {
		Bicycle customBicycle = new Bicycle.BicycleBuilder()
				.addGears(true)
				.addDoubleStand(false)
				.addDoubleSeat(true)
				.addCarrier(true)
				.build();

		customBicycle.showSpecifications();
	}
}
