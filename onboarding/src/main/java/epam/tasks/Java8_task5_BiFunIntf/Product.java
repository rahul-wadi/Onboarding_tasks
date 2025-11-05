package epam.tasks.Java8_task5_BiFunIntf;

public class Product {

	public String name;
	public double price;
	public String category;
	public String grade;

    public Product(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }
    
    public String getName() { return name; }

    public double getPrice() { return price; }

    public String getCategory() { return category; }
}
