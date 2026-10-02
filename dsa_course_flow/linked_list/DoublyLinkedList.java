package linked_list;

public class DoublyLinkedList {
	static class Node {
		int data;
		Node next;
		Node previous;

		Node(int data) {
			this.data = data;
		}
	}

	static Node head;
	static Node tail;

	public static void addFirst(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		newNode.next = head;
		head.previous = newNode;
		head = newNode;
	}

	public static void addLast(int value) {
		Node newNode = new Node(value);
		if (tail == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
	}

	public static void removeFirst() {
		if (head == null) {
			System.out.println("Doubly linked list is empty");
			return;
		}

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		head = head.next;
		head.previous = null;
	}

	public static void removeLast() {
		if (tail == null) {
			System.out.println("Doubly linked list is empty");
			return;
		}

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		tail = tail.previous;
		tail.next = null;
	}

	public static void printForward() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void printBackward() {
		Node current = tail;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.previous;
		}
		System.out.println("null");
	}

	public static int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static void main(String[] args) {
		addFirst(2);
		addFirst(1);
		addLast(3);
		System.out.println("Forward:");
		printForward();
		System.out.println("Backward:");
		printBackward();
		System.out.println("Size = " + size());
	}
}
