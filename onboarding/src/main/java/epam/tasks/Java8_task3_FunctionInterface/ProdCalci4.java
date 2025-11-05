package epam.tasks.Java8_task3_FunctionInterface;

import java.util.*;
import java.util.stream.Collectors;

public class ProdCalci4 {

	public static List<Product> getExpensiveElectronics(List<Product> products) {
        return products.stream()
                .filter(p -> p.getPrice() > 1000)
                .filter(p -> p.getCategory().equalsIgnoreCase("electronic"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Laptop", 55000, "Electronic", "A"),
                new Product("Mobile", 15000, "Electronic", "B"),
                new Product("Table", 3000, "Furniture", "A"),
                new Product("Fan", 950, "Electronic", "C"),
                new Product("Headphones", 1200, "Electronic", "A")
        );
        
        List<Product> result = getExpensiveElectronics(productList);

        System.out.println("Products with price > 1000 and category 'Electronic':");
        result.forEach(System.out::println);
    }
}
