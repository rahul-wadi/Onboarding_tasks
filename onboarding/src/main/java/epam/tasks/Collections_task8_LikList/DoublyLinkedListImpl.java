package epam.tasks.Collections_task8_LikList;

import java.util.Optional;

public class DoublyLinkedListImpl implements DoublyLinkedList {

	public Node head;
	public Node tail;

	public class Node {
		Object data;
		Node prev;
		Node next;

		Node(Object data) {
			this.data = data;
		}
	}

	public DoublyLinkedListImpl() {
		head = null;
		tail = null;
	}

	@Override
	public boolean addFirst(Object element) {
		if (element == null) throw new NullPointerException("Null elements not allowed.");

		Node newNode = new Node(element);
		if (head == null) { // empty list
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		return true;
	}

	@Override
	public boolean addLast(Object element) {
		if (element == null) throw new NullPointerException("Null elements not allowed.");

		Node newNode = new Node(element);
		if (tail == null) { // empty list
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		return true;
	}

	@Override
	public boolean delete(int index) {
		if (index < 0) throw new IndexOutOfBoundsException("Invalid index: " + index);

		Node current = head;
		int i = 0;
		while (current != null && i < index) {
			current = current.next;
			i++;
		}

		if (current == null)
			throw new IndexOutOfBoundsException("Index out of range: " + index);

		// unlink current node
		if (current.prev != null)
			current.prev.next = current.next;
		else
			head = current.next;

		if (current.next != null)
			current.next.prev = current.prev;
		else
			tail = current.prev;

		return true;
	}

	@Override
	public Optional<Object> remove(Object element) {
		if (element == null) throw new NullPointerException("Null elements not allowed.");

		Node current = head;
		while (current != null) {
			if (current.data.equals(element)) {
				Object removedData = current.data;

				// unlink current
				if (current.prev != null)
					current.prev.next = current.next;
				else
					head = current.next;

				if (current.next != null)
					current.next.prev = current.prev;
				else
					tail = current.prev;

				return Optional.of(removedData);
			}
			current = current.next;
		}
		return Optional.empty();
	}

	@Override
	public boolean set(int index, Object element) {
		if (element == null) throw new NullPointerException("Null elements not allowed.");
		if (index < 0) throw new IndexOutOfBoundsException("Invalid index: " + index);

		Node current = head;
		int i = 0;
		while (current != null && i < index) {
			current = current.next;
			i++;
		}

		if (current == null)
			throw new IndexOutOfBoundsException("Index out of range: " + index);

		current.data = element;
		return true;
	}

	@Override
	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	@Override
	public Object[] toArray() {
		int count = size();
		Object[] arr = new Object[count];
		Node current = head;
		int i = 0;
		while (current != null) {
			arr[i++] = current.data;
			current = current.next;
		}
		return arr;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head;
		while (current != null) {
			sb.append(current.data);
			if (current.next != null) sb.append(" ");
			current = current.next;
		}
		return sb.toString();
	}
}
