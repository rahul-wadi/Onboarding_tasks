package epam.tasks.Collections_task3_Map;

import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		Map<String, String> phoneBook = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			String phone = sc.nextLine();
			phoneBook.put(name, phone);
		}

		while (sc.hasNextLine()) {
			String query = sc.nextLine();
			if (phoneBook.containsKey(query)) {
				System.out.println(query + "=" + phoneBook.get(query));
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}
}
