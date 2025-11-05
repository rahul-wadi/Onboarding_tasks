package epam.tasks.Java8_task4_ConsSupp;

import java.io.*;
import java.util.function.*;

public class ProductPrint {

	public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000, "Electronics", "A");

        String printParam = "file";

        Consumer<Product> productPrinter = getProductPrinter(printParam);

        productPrinter.accept(p1);
    }

    public static Consumer<Product> getProductPrinter(String printParam) {
        if ("file".equalsIgnoreCase(printParam)) {
            return (Product p) -> {
                try (FileWriter writer = new FileWriter("product_log.txt", true)) {
                    writer.write(p.toString() + System.lineSeparator());
                    System.out.println("Product written to file: product_log.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
        } else {
            return (Product p) -> System.out.println(p);
        }
    }
}
