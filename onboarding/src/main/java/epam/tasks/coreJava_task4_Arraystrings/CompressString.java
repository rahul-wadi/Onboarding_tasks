package epam.tasks.coreJava_task4_Arraystrings;

public class CompressString {
	public static void main(String[] args) {
        String str = "aabcccccaaa";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // If next character is the same, increase count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        if (compressed.length() < str.length()) {
            System.out.println(compressed.toString());
        } else {
            System.out.println(str);
        }
    }
}
