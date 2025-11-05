package epam.tasks.Java8_task5_BiFunIntf;

import java.util.function.*;

public class ProductCreate {

	public static void main(String[] args) {

        BiFunction<String, Double, Product> createProduct = (name, price) ->
                new Product(name, price, "General", "A");

        Product product1 = createProduct.apply("Laptop", 79999.99);
        Product product2 = createProduct.apply("Headphones", 1999.50);

        System.out.println(product1);
        System.out.println(product2);
    }
}
