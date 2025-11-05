package epam.tasks.Java8_task6_PrimInterf;

import java.util.function.*;

public class SqrNum {

	public static void main(String[] args) {
        IntConsumer printSquare = num -> System.out.println("Square: " + (num * num));

        printSquare.accept(5);  //25
        printSquare.accept(8);  //64
    }
}
