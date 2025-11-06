package epam.tasks.DesignPatterns_task4_Decorator;

public class Format {

	public String name;
	public int rank;

    public Format(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}
