package linked_list;

public class DetectCycleInLinkedList {
	public static boolean hasCycle() {
		LLCreation.Node slow = LLCreation.head;
		LLCreation.Node fast = LLCreation.head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		LLCreation.head = LLCreation.createNode(1);
		LLCreation.head.next = LLCreation.createNode(2);
		LLCreation.head.next.next = LLCreation.createNode(3);
		LLCreation.head.next.next.next = LLCreation.createNode(4);
		LLCreation.head.next.next.next.next = LLCreation.head.next;

		System.out.println("Cycle present = " + hasCycle());
	}
}
