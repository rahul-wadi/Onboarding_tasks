package epam.tasks.Java8_task1_Lambda;

public class Rotation {

	interface CheckRotation {
        boolean check(String a, String b);
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        // Lambda expression implementing CheckRotation
        CheckRotation isRotation = (a, b) -> 
            a.length() == b.length() && (a + a).contains(b);

        if (isRotation.check(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1);
        }
    }
}
