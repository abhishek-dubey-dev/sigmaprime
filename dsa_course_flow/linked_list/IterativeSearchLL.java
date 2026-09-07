package linked_list;

public class IterativeSearchLL {
    public static int iterativeSearch(int key) {
        int index = 0;
        LLCreation.Node current = LLCreation.head;

        while (current != null) {
            if (current.data == key) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
        LLCreation.head = LLCreation.createNode(10);
        LLCreation.head.next = LLCreation.createNode(20);
        LLCreation.head.next.next = LLCreation.createNode(30);
        LLCreation.head.next.next.next = LLCreation.createNode(40);

        int key = 30;
        int index = iterativeSearch(key);

        if (index == -1) {
            System.out.println("Element " + key + " not found in linked list");
        } else {
            System.out.println("Element " + key + " found at index " + index);
        }
    }
}
