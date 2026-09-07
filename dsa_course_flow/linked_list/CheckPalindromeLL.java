package linked_list;

public class CheckPalindromeLL {
	public static boolean isPalindrome() {
		if (LLCreation.head == null || LLCreation.head.next == null) {
			return true;
		}

		LLCreation.Node slow = LLCreation.head;
		LLCreation.Node fast = LLCreation.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		LLCreation.Node secondHalfHead = reverse(slow.next);
		LLCreation.Node firstHalf = LLCreation.head;
		LLCreation.Node secondHalf = secondHalfHead;
		boolean palindrome = true;

		while (secondHalf != null) {
			if (firstHalf.data != secondHalf.data) {
				palindrome = false;
				break;
			}
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}

		slow.next = reverse(secondHalfHead);
		return palindrome;
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
		AddLastLL.addLast(2);
		AddLastLL.addLast(1);

		PrintLL.print();
		System.out.println("Is palindrome = " + isPalindrome());
		PrintLL.print();
	}
}
