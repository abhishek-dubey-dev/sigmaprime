package bst;

public class BinarySearchTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
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

    static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.value == target) {
            return true;
        }
        return target < root.value
                ? search(root.left, target)
                : search(root.right, target);
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }

        System.out.print("BST inorder: ");
        inorder(root);
        System.out.println();
        System.out.println("Search 6: " + search(root, 6));
        System.out.println("Search 12: " + search(root, 12));
    }
}
