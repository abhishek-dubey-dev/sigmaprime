package bst;

public class PrintInRange {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static void printInRange(Node root, int minimum, int maximum) {
        if (root == null || minimum > maximum) {
            return;
        }

        if (root.value > minimum) {
            printInRange(root.left, minimum, maximum);
        }
        if (root.value >= minimum && root.value <= maximum) {
            System.out.print(root.value + " ");
        }
        if (root.value < maximum) {
            printInRange(root.right, minimum, maximum);
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }

        System.out.print("Values in [5, 11]: ");
        printInRange(root, 5, 11);
        System.out.println();
    }
}
