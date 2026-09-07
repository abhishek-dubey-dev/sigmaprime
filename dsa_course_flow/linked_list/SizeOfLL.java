package linked_list;

public class SizeOfLL {
	public static int size() {
		int count = 0;
		LLCreation.Node current = LLCreation.head;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args) {
		AddLastLL.addLast(10);
		AddLastLL.addLast(20);
		AddLastLL.addLast(30);

		System.out.println("Size of linked list = " + size());
	}
}
