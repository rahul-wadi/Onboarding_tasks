package epam.tasks.Collections_task13_HashTable;

public interface HashtableOpen8to16 {

	void insert(int key, Object value);
    Object search(int key);
    void remove(int key);
    int size();
    int[] keys();

    static HashtableOpen8to16 getInstance() {
        return new HashtableOpen8to16Impl();
    }
}
