package linked_list;

public class AddLastLL {
	public static void addLast(int value) {
		LLCreation.Node newNode = LLCreation.createNode(value);

		if (LLCreation.head == null) {
			LLCreation.head = newNode;
			LLCreation.tail = newNode;
			return;
		}

		LLCreation.tail.next = newNode;
		LLCreation.tail = newNode;
	}

	public static void main(String[] args) {
		addLast(1);
		addLast(2);
		PrintLL.print();
	}
}
