package binary_tree;

public class KthLevel {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static void printKthLevel(Node root, int level, int k) {
        if (root == null || k < 1) {
            return;
        }
        if (level == k) {
            System.out.print(root.value + " ");
            return;
        }

        printKthLevel(root.left, level + 1, k);
        printKthLevel(root.right, level + 1, k);
    }

    static void printKthLevel(Node root, int k) {
        printKthLevel(root, 1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Nodes at level 3: ");
        printKthLevel(root, 3);
    }
}