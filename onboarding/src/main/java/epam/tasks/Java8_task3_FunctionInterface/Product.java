package epam.tasks.Java8_task3_FunctionInterface;

public class Product {

	public String name;
	public double price;
	public String category;
	public String grade;

    // Constructor
    public Product(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public double getPrice() {
        return price;
    }
    
    public String getName() {
    		return name;
    }
    
    public String getCategory() {
		return category;
    }
    
    public String getGrade() {
		return grade;
    }
}
