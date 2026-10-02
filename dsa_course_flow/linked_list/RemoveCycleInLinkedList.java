package linked_list;

public class RemoveCycleInLinkedList {
	public static boolean removeCycle() {
		LLCreation.Node slow = LLCreation.head;
		LLCreation.Node fast = LLCreation.head;
		boolean cycleFound = false;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				cycleFound = true;
				break;
			}
		}

		if (!cycleFound) {
			return false;
		}

		slow = LLCreation.head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		LLCreation.Node cycleStart = slow;
		LLCreation.Node cycleEnd = cycleStart;
		while (cycleEnd.next != cycleStart) {
			cycleEnd = cycleEnd.next;
		}
		cycleEnd.next = null;
		LLCreation.tail = cycleEnd;
		return true;
	}

	public static void main(String[] args) {
		LLCreation.head = LLCreation.createNode(1);
		LLCreation.head.next = LLCreation.createNode(2);
		LLCreation.head.next.next = LLCreation.createNode(3);
		LLCreation.head.next.next.next = LLCreation.createNode(4);
		LLCreation.head.next.next.next.next = LLCreation.head.next;

		System.out.println("Cycle removed = " + removeCycle());
		PrintLL.print();
	}
}
