package epam.tasks.Java8_task6_PrimInterf;

import java.util.function.*;

public class PrimeCheck {

	public static void main(String[] args) {
        IntPredicate isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int number = 17;
        System.out.println(number + " is prime? " + isPrime.test(number));

        number = 15;
        System.out.println(number + " is prime? " + isPrime.test(number));
    }
}
