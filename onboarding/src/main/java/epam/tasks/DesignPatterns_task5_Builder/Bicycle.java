package epam.tasks.DesignPatterns_task5_Builder;

public class Bicycle {

	public final boolean hasGears;
	public final boolean hasDoubleStand;
	public final boolean hasDoubleSeat;
	public final boolean hasCarrier;

	public Bicycle(BicycleBuilder builder) {
		this.hasGears = builder.hasGears;
		this.hasDoubleStand = builder.hasDoubleStand;
		this.hasDoubleSeat = builder.hasDoubleSeat;
		this.hasCarrier = builder.hasCarrier;
	}

	public void showSpecifications() {
		System.out.println("Bicycle Specifications:");
		System.out.println("Gears: " + (hasGears ? "Yes" : "No"));
		System.out.println("Double Stand: " + (hasDoubleStand ? "Yes" : "No"));
		System.out.println("Double Seat: " + (hasDoubleSeat ? "Yes" : "No"));
		System.out.println("Carrier: " + (hasCarrier ? "Yes" : "No"));
	}
	
	public static class BicycleBuilder {

		public boolean hasGears;
		public boolean hasDoubleStand;
		public boolean hasDoubleSeat;
		public boolean hasCarrier;
		public boolean isBuilt = false;

		public BicycleBuilder addGears(boolean value) {
			checkIfBuilt();
			this.hasGears = value;
			return this;
		}

		public BicycleBuilder addDoubleStand(boolean value) {
			checkIfBuilt();
			this.hasDoubleStand = value;
			return this;
		}

		public BicycleBuilder addDoubleSeat(boolean value) {
			checkIfBuilt();
			this.hasDoubleSeat = value;
			return this;
		}

		public BicycleBuilder addCarrier(boolean value) {
			checkIfBuilt();
			this.hasCarrier = value;
			return this;
		}

		// Finalize and build the bicycle
		public Bicycle build() {
			checkIfBuilt();
			this.isBuilt = true;
			return new Bicycle(this);
		}

		private void checkIfBuilt() {
			if (isBuilt) {
				throw new IllegalStateException("Bicycle is already built. Choices cannot be changed!");
			}
		}
	}
}
