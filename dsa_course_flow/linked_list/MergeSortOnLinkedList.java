package linked_list;

public class MergeSortOnLinkedList {
	public static void sort() {
		LLCreation.head = mergeSort(LLCreation.head);
		LLCreation.tail = LLCreation.head;
		if (LLCreation.tail != null) {
			while (LLCreation.tail.next != null) {
				LLCreation.tail = LLCreation.tail.next;
			}
		}
	}

	private static LLCreation.Node mergeSort(LLCreation.Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		LLCreation.Node middle = getMiddle(head);
		LLCreation.Node rightHead = middle.next;
		middle.next = null;

		LLCreation.Node left = mergeSort(head);
		LLCreation.Node right = mergeSort(rightHead);
		return merge(left, right);
	}

	private static LLCreation.Node getMiddle(LLCreation.Node head) {
		LLCreation.Node slow = head;
		LLCreation.Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private static LLCreation.Node merge(LLCreation.Node left, LLCreation.Node right) {
		LLCreation.Node dummy = new LLCreation.Node(0);
		LLCreation.Node current = dummy;

		while (left != null && right != null) {
			if (left.data <= right.data) {
				current.next = left;
				left = left.next;
			} else {
				current.next = right;
				right = right.next;
			}
			current = current.next;
		}
		current.next = left != null ? left : right;
		return dummy.next;
	}

	public static void main(String[] args) {
		AddLastLL.addLast(4);
		AddLastLL.addLast(2);
		AddLastLL.addLast(1);
		AddLastLL.addLast(3);

		System.out.println("Before sorting:");
		PrintLL.print();
		sort();
		System.out.println("After sorting:");
		PrintLL.print();
	}
}
