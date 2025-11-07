package epam.tasks.Collections_task4_Stack;

import java.util.*;

public class Bracket {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) { 
            String str = sc.nextLine().trim();
            System.out.println(isBalanced(str));
        }
        sc.close();
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
