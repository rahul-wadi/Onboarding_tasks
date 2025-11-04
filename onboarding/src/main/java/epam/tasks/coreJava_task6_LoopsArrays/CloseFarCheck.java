package epam.tasks.coreJava_task6_LoopsArrays;

public class CloseFarCheck {

	public static void main(String[] args) {
        // Example test cases
        System.out.println(closeFar(1, 2, 10)); // true
        System.out.println(closeFar(1, 2, 3));  // false
        System.out.println(closeFar(4, 1, 3));  // true
    }

    public static boolean closeFar(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        int bc = Math.abs(b - c);

        // One is close (diff ≤ 1) and the other is far (diff ≥ 2 from both others)
        if ((ab <= 1 && ac >= 2 && bc >= 2) || (ac <= 1 && ab >= 2 && bc >= 2)) {
            return true;
        } else {
            return false;
        }
    }
}
