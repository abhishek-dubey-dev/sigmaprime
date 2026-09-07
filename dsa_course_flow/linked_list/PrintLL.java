package linked_list;

public class PrintLL {
	public static void print() {
		LLCreation.Node current = LLCreation.head;

		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {
		AddLastLL.addLast(1);
		AddLastLL.addLast(2);
		AddLastLL.addLast(3);
		print();
	}
}
