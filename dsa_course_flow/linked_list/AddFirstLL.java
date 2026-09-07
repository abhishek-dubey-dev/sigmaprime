package linked_list;

public class AddFirstLL {
	public static void addFirst(int value) {
		LLCreation.Node newNode = LLCreation.createNode(value);

		if (LLCreation.head == null) {
			LLCreation.head = newNode;
			LLCreation.tail = newNode;
			return;
		}

		newNode.next = LLCreation.head;
		LLCreation.head = newNode;
	}

	public static void main(String[] args) {
		addFirst(2);
		addFirst(1);
		PrintLL.print();
	}
}
