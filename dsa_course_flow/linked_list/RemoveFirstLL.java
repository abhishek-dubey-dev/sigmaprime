package linked_list;

public class RemoveFirstLL {
    public static void removeFirst() {
        if (LLCreation.head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if (LLCreation.head == LLCreation.tail) {
            LLCreation.head = null;
            LLCreation.tail = null;
            return;
        }

        LLCreation.head = LLCreation.head.next;
    }

    public static void main(String[] args) {
        AddLastLL.addLast(10);
        AddLastLL.addLast(20);
        AddLastLL.addLast(30);

        System.out.println("Before removing first:");
        PrintLL.print();

        removeFirst();

        System.out.println("After removing first:");
        PrintLL.print();
    }
}
