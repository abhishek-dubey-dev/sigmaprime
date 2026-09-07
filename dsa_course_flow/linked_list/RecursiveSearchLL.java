package linked_list;

public class RecursiveSearchLL {
    public static int recursiveSearch(LLCreation.Node node, int key) {
        if (node == null) {
            return -1;
        }

        if (node.data == key) {
            return 0;
        }

        int index = recursiveSearch(node.next, key);
        return (index == -1) ? -1 : index + 1;
    }

    public static void main(String[] args) {
        LLCreation.head = LLCreation.createNode(10);
        LLCreation.head.next = LLCreation.createNode(20);
        LLCreation.head.next.next = LLCreation.createNode(30);
        LLCreation.head.next.next.next = LLCreation.createNode(40);

        int key = 30;
        int index = recursiveSearch(LLCreation.head, key);

        if (index == -1) {
            System.out.println("Element " + key + " not found in linked list");
        } else {
            System.out.println("Element " + key + " found at index " + index);
        }
    }
}
