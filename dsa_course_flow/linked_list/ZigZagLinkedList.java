package linked_list;

public class ZigZagLinkedList {
	public static void zigzag() {
		if (LLCreation.head == null || LLCreation.head.next == null) {
			return;
		}

		LLCreation.Node slow = LLCreation.head;
		LLCreation.Node fast = LLCreation.head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		LLCreation.Node secondHalf = slow.next;
		slow.next = null;
		secondHalf = reverse(secondHalf);

		LLCreation.Node firstHalf = LLCreation.head;
		while (secondHalf != null) {
			LLCreation.Node firstNext = firstHalf.next;
			LLCreation.Node secondNext = secondHalf.next;
			firstHalf.next = secondHalf;
			secondHalf.next = firstNext;
			firstHalf = firstNext;
			secondHalf = secondNext;
		}

		LLCreation.tail = LLCreation.head;
		while (LLCreation.tail.next != null) {
			LLCreation.tail = LLCreation.tail.next;
		}
	}

	private static LLCreation.Node reverse(LLCreation.Node node) {
		LLCreation.Node previous = null;
		LLCreation.Node current = node;
		while (current != null) {
			LLCreation.Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		AddLastLL.addLast(1);
		AddLastLL.addLast(2);
		AddLastLL.addLast(3);
		AddLastLL.addLast(4);
		AddLastLL.addLast(5);

		System.out.println("Before zig-zag:");
		PrintLL.print();
		zigzag();
		System.out.println("After zig-zag:");
		PrintLL.print();
	}
}
