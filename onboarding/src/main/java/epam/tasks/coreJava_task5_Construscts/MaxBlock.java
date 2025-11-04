package epam.tasks.coreJava_task5_Construscts;

public class MaxBlock {

	public static void main(String[] args) {
		System.out.println(maxBlock("hoopla"));        // 2
		System.out.println(maxBlock("abbCCCddBBBxx")); // 3
		System.out.println(maxBlock(""));              // 0
	}

	public static int maxBlock(String str) {
		int max = 0;
		int count = 1;

		// If string is empty, return 0
		if (str.length() == 0) {
			return 0;
		}

		// Loop through each character
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 1; // reset count for next block
			}
		}

		// Final check (in case the longest block is at the end)
		if (count > max) {
			max = count;
		}

		return max;
	}
}
