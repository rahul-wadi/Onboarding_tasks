package epam.tasks.Collections_task13_HashTable;

public class HashtableOpen8to16Impl implements HashtableOpen8to16 {

	public static final int INITIAL_CAPACITY = 8;
	public static final int MAX_CAPACITY = 16;
	public static final int MIN_CAPACITY = 2;
	
	public int[] keys;
	public Object[] values;
	public int capacity;
	public int size;
	public boolean[] occupied;
	
	public HashtableOpen8to16Impl() {
        this.capacity = INITIAL_CAPACITY;
        this.keys = new int[capacity];
        this.values = new Object[capacity];
        occupied = new boolean[capacity];
        size = 0;
    }
    
	@Override
	public void insert(int key, Object value) {
		if (size == capacity) {
            if (capacity == MAX_CAPACITY) {
                throw new IllegalStateException("Maximum capacity reached");
            }
            resize(capacity * 2);
        }

		int index = hash(key);
        for (int i = 0; i < capacity; i++) {
            int probe = (index + i) % capacity;

            if (occupied[probe] && keys[probe] == key) {
                values[probe] = value;
                return;
            }

            if (!occupied[probe]) {
                keys[probe] = key;
                values[probe] = value;
                occupied[probe] = true;
                size++;
                return;
            }
        }
	}

	@Override
	public Object search(int key) {
		int index = hash(key);
		for (int i = 0; i < capacity; i++) {
            int probe = (index + i) % capacity;
            if (occupied[probe] && keys[probe] == key) {
                return values[probe];
            }
            if (!occupied[probe]) {
                return null;
            }
        }
        return null;
	}

	@Override
	public void remove(int key) {
		int index = hash(key);
        for (int i = 0; i < capacity; i++) {
            int probe = (index + i) % capacity;
            if (occupied[probe] && keys[probe] == key) {
                occupied[probe] = false;
                values[probe] = null;
                size--;

                if (size > 0 && size <= capacity / 4 && capacity > MIN_CAPACITY) {
                    resize(capacity / 2);
                }
                return;
            }
            if (!occupied[probe]) return;
        }
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int[] keys() {
		int[] result = new int[size];
		int j = 0;
        for (int i = 0; i < capacity; i++) {
            if (occupied[i]) {
                result[j++] = keys[i];
            }
        }
        return result;
	}
	
	private int hash(int key) {
        return Math.abs(key) % capacity;
    }

    private void resize(int newCapacity) {
        if (newCapacity < MIN_CAPACITY) newCapacity = MIN_CAPACITY;
        if (newCapacity > MAX_CAPACITY) newCapacity = MAX_CAPACITY;

        int[] oldKeys = keys;
        Object[] oldValues = values;
        boolean[] oldOccupied = occupied;
        int oldCapacity = capacity;

        capacity = newCapacity;
        keys = new int[capacity];
        values = new Object[capacity];
        occupied = new boolean[capacity];
        size = 0;

        for (int i = 0; i < oldCapacity; i++) {
            if (oldOccupied[i]) {
                insert(oldKeys[i], oldValues[i]);
            }
        }
    }
}
