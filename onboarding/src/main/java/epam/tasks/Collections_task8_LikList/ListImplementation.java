package epam.tasks.Collections_task8_LikList;

import java.util.*;

public class ListImplementation {

	public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedListImpl();
        list.addFirst("B");
        list.addLast("C");
        list.addFirst("A");

        System.out.println(list); // A B C

        list.set(1, "X");
        System.out.println(list); // A X C

        list.delete(2);
        System.out.println(list); // A X

        list.remove("A");
        System.out.println(list); // X

        System.out.println(list.size()); // 1
        System.out.println(Arrays.toString(list.toArray())); // [X]
    }
}
