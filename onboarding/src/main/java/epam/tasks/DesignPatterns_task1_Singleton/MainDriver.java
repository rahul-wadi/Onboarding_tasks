package epam.tasks.DesignPatterns_task1_Singleton;

public class MainDriver {

	public static void main(String[] args) {
        CandyMaker maker1 = CandyMaker.getInstance();
        CandyMaker maker2 = CandyMaker.getInstance();

        System.out.println(maker1 == maker2); // true

        maker1.fill();
        maker1.boil();
        maker1.drain();
    }
}
