package epam.tasks.Collections_task5_TreeMap;

import java.util.*;

public class TreeMapExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int Q = sc.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			StringBuilder output = new StringBuilder();

			for (int i = 0; i < Q; i++) {
				String type = sc.next();

				switch (type) {
				case "a": { 
					int x = sc.nextInt();
					int y = sc.nextInt();
					map.put(x, y);
					break;
				}
				case "b": { 
					int x = sc.nextInt();
					output.append(map.getOrDefault(x, -1)).append(" ");
					break;
				}
				case "c": {
					output.append(map.size()).append(" ");
					break;
				}
				case "d": { 
					int x = sc.nextInt();
					map.remove(x);
					break;
				}
				case "e": { 
					if (map.isEmpty()) {
						output.append("Empty ");
					} else {
						for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
							output.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");
						}
					}
					break;
				}
				default:
					break;
				}
			}
			System.out.println(output.toString().trim());
		}

		sc.close();
	}
}
