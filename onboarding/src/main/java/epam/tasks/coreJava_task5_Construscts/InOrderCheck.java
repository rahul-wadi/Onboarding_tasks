package epam.tasks.coreJava_task5_Construscts;

public class InOrderCheck {
	public static void main(String[] args) {
        // Example test cases
        System.out.println(inOrder(1, 2, 4, false)); // true
        System.out.println(inOrder(1, 2, 1, false)); // false
        System.out.println(inOrder(1, 1, 2, true));  // true
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean result;

        if (bOk) {
            // If bOk is true, only need c > b
            if (c > b) {
                result = true;
            } else {
                result = false;
            }
        } else {
            // If bOk is false, need both b > a and c > b
            if (b > a && c > b) {
                result = true;
            } else {
                result = false;
            }
        }

        return result;
    }
}
