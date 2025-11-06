package epam.tasks.DesignPatterns_task1_Singleton;

public class CandyMaker {

	private boolean empty;
	private boolean boiled;

	private static volatile CandyMaker instance;

	private CandyMaker() {
		empty = true;
		boiled = false;
	}

	public static CandyMaker getInstance() {
		if (instance == null) { // First check (no locking)
			synchronized (CandyMaker.class) {
				if (instance == null) { // Second check (with locking)
					instance = new CandyMaker();
				}
			}
		}
		return instance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Filling the candy maker with milk and chocolate mix...");
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			System.out.println("Draining the boiled mixture...");
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			System.out.println("Boiling the contents...");
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
