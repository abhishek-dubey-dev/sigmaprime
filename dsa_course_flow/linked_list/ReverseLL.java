package linked_list;

public class ReverseLL {
	public static void reverse() {
		LLCreation.Node previous = null;
		LLCreation.Node current = LLCreation.head;

		LLCreation.tail = LLCreation.head;

		while (current != null) {
			LLCreation.Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		LLCreation.head = previous;
	}

	public static void main(String[] args) {
		AddLastLL.addLast(1);
		AddLastLL.addLast(2);
		AddLastLL.addLast(3);

		System.out.println("Before reversing:");
		PrintLL.print();

		reverse();

		System.out.println("After reversing:");
		PrintLL.print();
	}
}
