package epam.tasks.coreJava_task5_Construscts;

public class RemoveRepeatedLetter {
	public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo")); // He there
        System.out.println(withoutString("Hello there", "e"));   // Hllo thr
        System.out.println(withoutString("Hello there", "x"));   // Hello there
    }

    public static String withoutString(String base, String remove) {
        String result = "";
        int i = 0;
        int baseLen = base.length();
        int remLen = remove.length();

        while (i < baseLen) {
            boolean match = true;

            if (i + remLen <= baseLen) {
                for (int j = 0; j < remLen; j++) {
                    char c1 = base.charAt(i + j);
                    char c2 = remove.charAt(j);
                    // Convert both to lowercase manually (no toLowerCase())
                    if (c1 >= 'A' && c1 <= 'Z') c1 = (char)(c1 + 32);
                    if (c2 >= 'A' && c2 <= 'Z') c2 = (char)(c2 + 32);
                    if (c1 != c2) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }

            if (match) {
                i += remLen;
            } else {
                result += base.charAt(i);
                i++;
            }
        }

        return result;
    }
}
