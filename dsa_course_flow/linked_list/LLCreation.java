package linked_list;

public class LLCreation {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node createNode(int data) {
        return new Node(data);
    }

    public static void main(String[] args) {
        head = createNode(1);
        head.next = createNode(2);
        head.next.next = createNode(3);
        tail = head.next.next;

        PrintLL.print();
    }
}
