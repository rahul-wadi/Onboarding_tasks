package epam.tasks.Collections_task6_All;

import java.util.*;

public class CollectionsAll {

	public static void main(String[] args) {

        // a) ArrayList - maintains insertion order, allows duplicates
        System.out.println("=== ArrayList Demo ===");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple");
        System.out.println("ArrayList: " + arrayList);

        // b) LinkedList - maintains insertion order, faster for insertion/deletion at ends
        System.out.println("\n=== LinkedList Demo ===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");
        linkedList.addFirst("Zebra");
        System.out.println("LinkedList: " + linkedList);
        linkedList.removeLast();
        System.out.println("After removing last element: " + linkedList);

        // c) HashMap - key-value pairs, unordered, keys unique
        System.out.println("\n=== HashMap Demo ===");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(1, "Updated One");
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for key 2: " + hashMap.get(2));

        // d) LinkedHashMap - maintains insertion order of keys
        System.out.println("\n=== LinkedHashMap Demo ===");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Ten");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(15, "Fifteen");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // e) HashSet - unordered collection, unique elements only
        System.out.println("\n=== HashSet Demo ===");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red");
        System.out.println("HashSet: " + hashSet);

        // f) LinkedHashSet - maintains insertion order, unique elements
        System.out.println("\n=== LinkedHashSet Demo ===");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // g) TreeSet - sorted set, unique elements, uses natural ordering
        System.out.println("\n=== TreeSet Demo ===");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(10);
        System.out.println("TreeSet (Sorted): " + treeSet);

        // h) TreeMap - sorted map based on keys
        System.out.println("\n=== TreeMap Demo ===");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        System.out.println("TreeMap (Sorted by Key): " + treeMap);
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());
    }
}
