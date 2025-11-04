package epam.tasks.coreJava_task5_Construscts;

public class SumNumbers {

	public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz")); // 123
        System.out.println(sumNumbers("aa11b33"));   // 44
        System.out.println(sumNumbers("7 11"));      // 18
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        int num = 0;
        boolean inNumber = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                // If it's a digit, build the current number
                num = num * 10 + (ch - '0');
                inNumber = true;
            } else {
                // If non-digit and we were in a number, add it to sum
                if (inNumber) {
                    sum += num;
                    num = 0;
                    inNumber = false;
                }
            }
        }

        // If string ends with a number, add the last one
        if (inNumber) {
            sum += num;
        }

        return sum;
    }
}
