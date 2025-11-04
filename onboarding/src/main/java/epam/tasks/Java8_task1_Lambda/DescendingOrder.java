package epam.tasks.Java8_task1_Lambda;

import java.util.*;

public class DescendingOrder {

	public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> b.compareTo(a));
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(4, "Cherry");
        map.put(2, "Mango");
        System.out.println("TreeMap sorted in descending order:");
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
