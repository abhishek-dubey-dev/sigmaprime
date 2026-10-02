package linked_list;

public class ReverseDoublyLinkedList {
	public static void reverse() {
		DoublyLinkedList.Node current = DoublyLinkedList.head;
		DoublyLinkedList.Node previous = null;

		while (current != null) {
			previous = current.previous;
			current.previous = current.next;
			current.next = previous;
			current = current.previous;
		}

		if (previous != null) {
			DoublyLinkedList.tail = DoublyLinkedList.head;
			DoublyLinkedList.head = previous.previous;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList.addLast(1);
		DoublyLinkedList.addLast(2);
		DoublyLinkedList.addLast(3);

		System.out.println("Before reversing:");
		DoublyLinkedList.printForward();
		reverse();
		System.out.println("After reversing:");
		DoublyLinkedList.printForward();
	}
}
