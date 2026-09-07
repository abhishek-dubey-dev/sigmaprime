package linked_list;

public class RemoveLastLL {
    public static void removeLast() {
        if (LLCreation.head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if (LLCreation.head == LLCreation.tail) {
            LLCreation.head = null;
            LLCreation.tail = null;
            return;
        }

        LLCreation.Node current = LLCreation.head;

        while (current.next != LLCreation.tail) {
            current = current.next;
        }

        current.next = null;
        LLCreation.tail = current;
    }

    public static void main(String[] args) {
        AddLastLL.addLast(10);
        AddLastLL.addLast(20);
        AddLastLL.addLast(30);

        System.out.println("Before removing last:");
        PrintLL.print();

        removeLast();

        System.out.println("After removing last:");
        PrintLL.print();
    }
}
