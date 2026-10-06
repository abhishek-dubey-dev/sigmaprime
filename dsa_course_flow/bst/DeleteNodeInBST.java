package bst;

public class DeleteNodeInBST {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node deleteNode(Node root, int target) {
        if (root == null) {
            return null;
        }

        if (target < root.value) {
            root.left = deleteNode(root.left, target);
        } else if (target > root.value) {
            root.right = deleteNode(root.right, target);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            Node successor = minimum(root.right);
            root.value = successor.value;
            root.right = deleteNode(root.right, successor.value);
        }
        return root;
    }

    static Node minimum(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
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

        root = deleteNode(root, 10);
        System.out.print("After deleting 10: ");
        inorder(root);
        System.out.println();
    }
}
