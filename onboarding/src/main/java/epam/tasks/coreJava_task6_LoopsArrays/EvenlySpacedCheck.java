package epam.tasks.coreJava_task6_LoopsArrays;

public class EvenlySpacedCheck {

	public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6)); // true
        System.out.println(evenlySpaced(4, 6, 2)); // true
        System.out.println(evenlySpaced(4, 6, 3)); // false
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int small = a;
        int medium = b;
        int large = c;

        if (b < small) {
            small = b;
            medium = a;
            large = c;
        }
        if (c < small) {
            small = c;
            medium = a;
            large = b;
        }

        // Adjust medium and large correctly
        if ((a > small && a < b) || (a > small && a < c)) {
            medium = a;
        } else if ((b > small && b < a) || (b > small && b < c)) {
            medium = b;
        } else {
            medium = c;
        }

        // Find the largest value
        if (a > b && a > c) {
            large = a;
        } else if (b > a && b > c) {
            large = b;
        } else {
            large = c;
        }

        // Check evenly spaced condition
        int diff1 = medium - small;
        int diff2 = large - medium;

        if (diff1 == diff2) {
            return true;
        } else {
            return false;
        }
    }
}
