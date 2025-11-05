package epam.tasks.Java8_task8_Stream;

public class Multiplication {

	public static void main(String[] args) {
        MathOperation multiply = (a, b) -> a * b;

        int result = multiply.operate(5, 3);
        System.out.println("Multiplication result: " + result);
    }
}
