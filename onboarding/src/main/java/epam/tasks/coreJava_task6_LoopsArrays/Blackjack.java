package epam.tasks.coreJava_task6_LoopsArrays;

public class Blackjack {

	public static void main(String[] args) {
        // Example test cases
        System.out.println(blackjack(19, 21)); // → 21
        System.out.println(blackjack(21, 19)); // → 21
        System.out.println(blackjack(19, 22)); // → 19
        System.out.println(blackjack(22, 22)); // → 0
    }

    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0; // both go over 21
        } else if (a > 21) {
            return b; // a goes over
        } else if (b > 21) {
            return a; // b goes over
        } else {
            // both are ≤ 21, return the one closer to 21
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }
}
