package epam.tasks.Collections_task13_HashTable;

public class TestHashtable {

	public static void main(String[] args) {
	HashtableOpen8to16 table = HashtableOpen8to16.getInstance();
    table.insert(1, "A");
    table.insert(2, "B");
    table.insert(3, "C");

    System.out.println("Search 2: " + table.search(2)); // B
    System.out.println("Size: " + table.size()); // 3

    table.remove(2);
    System.out.println("After removal, size: " + table.size()); // 2

    table.insert(4, "D");
    table.insert(5, "E");

    int[] keys = table.keys();
    System.out.print("Keys in table: ");
    for (int k : keys) {
        System.out.print(k + " ");
    }
    System.out.println();

    System.out.println("Search(5): " + table.search(5));
	}
}
