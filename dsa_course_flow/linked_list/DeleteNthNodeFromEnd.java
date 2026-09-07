package linked_list;

public class DeleteNthNodeFromEnd {
	public static void deleteNthNodeFromEnd(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n must be greater than zero");
		}

		LLCreation.Node fast = LLCreation.head;
		for (int step = 0; step < n; step++) {
			if (fast == null) {
				throw new IndexOutOfBoundsException("n is larger than the linked list size");
			}
			fast = fast.next;
		}

		if (fast == null) {
			RemoveFirstLL.removeFirst();
			return;
		}

		LLCreation.Node slow = LLCreation.head;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		LLCreation.Node nodeToDelete = slow.next;
		slow.next = nodeToDelete.next;
		if (nodeToDelete == LLCreation.tail) {
			LLCreation.tail = slow;
		}
	}

	public static void main(String[] args) {
		AddLastLL.addLast(10);
		AddLastLL.addLast(20);
		AddLastLL.addLast(30);
		AddLastLL.addLast(40);

		System.out.println("Before deletion:");
		PrintLL.print();

		deleteNthNodeFromEnd(2);

		System.out.println("After deleting 2nd node from end:");
		PrintLL.print();
	}
}
