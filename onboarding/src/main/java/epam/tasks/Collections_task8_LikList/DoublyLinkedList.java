package epam.tasks.Collections_task8_LikList;

import java.util.Optional;

public interface DoublyLinkedList {

	boolean addFirst(Object element);
    boolean addLast(Object element);
    boolean delete(int index);
    Optional<Object> remove(Object element);
    boolean set(int index, Object element);
    int size();
    Object[] toArray();
    String toString();
}
