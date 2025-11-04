package epam.tasks.coreJava_task5_Construscts;

public class SumLimit {

	public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));  // → 5
        System.out.println(sumLimit(8, 3));  // → 8
        System.out.println(sumLimit(8, 1));  // → 9
    }

    public static int sumLimit(int a, int b) {
        int sum = a + b;

        int digitsA = 0;
        int digitsSum = 0;

        int tempA = a;
        int tempSum = sum;

        // Count digits of a
        if (tempA == 0)
            digitsA = 1;
        else {
            while (tempA > 0) {
                digitsA++;
                tempA = tempA / 10;
            }
        }

        // Count digits of sum
        if (tempSum == 0)
            digitsSum = 1;
        else {
            while (tempSum > 0) {
                digitsSum++;
                tempSum = tempSum / 10;
            }
        }

        // Compare digit counts
        if (digitsSum == digitsA)
            return sum;
        else
            return a;
    }
}
