package linked_list;

public class CircularLinkedList {
	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	private static Node head;
	private static Node tail;

	public static void addFirst(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
		tail.next = head;
	}

	public static void addLast(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = newNode;
			return;
		}

		newNode.next = head;
		tail.next = newNode;
		tail = newNode;
	}

	public static void removeFirst() {
		if (head == null) {
			System.out.println("Circular linked list is empty");
			return;
		}

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		head = head.next;
		tail.next = head;
	}

	public static int size() {
		if (head == null) {
			return 0;
		}

		int count = 0;
		Node current = head;
		do {
			count++;
			current = current.next;
		} while (current != head);
		return count;
	}

	public static void print() {
		if (head == null) {
			System.out.println("Circular linked list is empty");
			return;
		}

		Node current = head;
		do {
			System.out.print(current.data + " -> ");
			current = current.next;
		} while (current != head);
		System.out.println("(head)");
	}

	public static void main(String[] args) {
		addLast(1);
		addLast(2);
		addFirst(0);
		print();
		removeFirst();
		print();
		System.out.println("Size = " + size());
	}
}
