package epam.tasks.Java8_task4_ConsSupp;

public class Product {

	public String name;
	public double price;
	public String category;
	public String grade;

	public Product(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
	
    public Product(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public String getCategory() { return category; }

    public String getGrade() { return grade; }
    
    public void setName(String name) { this.name = name; }
    
    public void setGrade(String grade) { this.grade = grade; }
}
