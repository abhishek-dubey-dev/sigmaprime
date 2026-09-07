package linked_list;

public class AddMiddleLL {
	public static void addMiddle(int index, int value) {
		if (index < 0 || index > SizeOfLL.size()) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}

		if (index == 0) {
			AddFirstLL.addFirst(value);
			return;
		}

		LLCreation.Node previous = LLCreation.head;
		for (int position = 1; position < index; position++) {
			previous = previous.next;
		}

		LLCreation.Node newNode = LLCreation.createNode(value);
		newNode.next = previous.next;
		previous.next = newNode;

		if (newNode.next == null) {
			LLCreation.tail = newNode;
		}
	}

	public static void main(String[] args) {
		AddLastLL.addLast(1);
		AddLastLL.addLast(3);
		addMiddle(1, 2);
		PrintLL.print();
	}
}
