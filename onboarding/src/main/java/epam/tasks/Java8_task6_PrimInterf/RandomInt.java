package epam.tasks.Java8_task6_PrimInterf;

import java.util.*;
import java.util.function.*;

public class RandomInt {

	public static void main(String[] args) {
        IntSupplier randomIntSupplier = () -> new Random().nextInt(5000);

        for (int i = 0; i < 5; i++) {
            System.out.println(randomIntSupplier.getAsInt());
        }
    }
}
