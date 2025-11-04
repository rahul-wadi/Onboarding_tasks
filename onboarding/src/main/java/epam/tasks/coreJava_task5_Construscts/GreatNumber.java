package epam.tasks.coreJava_task5_Construscts;

public class GreatNumber {
	public static boolean isGreatNumber(int a, int b) {
        if (a == 6 || b == 6)
            return true;

        if (a + b == 6)
            return true;

        int diff = a - b;
        if (diff < 0)
            diff = -diff;

        if (diff == 6)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isGreatNumber(6, 4));   // true (a is 6)
        System.out.println(isGreatNumber(4, 2));   // true (sum = 6)
        System.out.println(isGreatNumber(10, 4));  // true (difference = 6)
        System.out.println(isGreatNumber(3, 8));   // false
    }
}
