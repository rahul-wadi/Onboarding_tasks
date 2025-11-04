package epam.tasks.coreJava_task5_Construscts;

public class ShareDigit {
	public static void main(String[] args) {
        System.out.println(shareDigit(12, 23)); // true
        System.out.println(shareDigit(12, 43)); // false
        System.out.println(shareDigit(12, 44)); // false
    }

    public static boolean shareDigit(int a, int b) {
        // Extract digits
        int aLeft = a / 10;   // left digit of 'a'
        int aRight = a % 10;  // right digit of 'a'
        int bLeft = b / 10;   // left digit of 'b'
        int bRight = b % 10;  // right digit of 'b'

        boolean result;

        // Check if any digits match
        if (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
