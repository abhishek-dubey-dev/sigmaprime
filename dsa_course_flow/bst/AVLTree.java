package bst;

public class AVLTree {
    static class Node {
        int value;
        int height = 1;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static int height(Node node) {
        return node == null ? 0 : node.height;
    }

    static int balanceFactor(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    static void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    static Node rotateRight(Node root) {
        Node newRoot = root.left;
        Node transferredSubtree = newRoot.right;

        newRoot.right = root;
        root.left = transferredSubtree;

        updateHeight(root);
        updateHeight(newRoot);
        return newRoot;
    }

    static Node rotateLeft(Node root) {
        Node newRoot = root.right;
        Node transferredSubtree = newRoot.left;

        newRoot.left = root;
        root.right = transferredSubtree;

        updateHeight(root);
        updateHeight(newRoot);
        return newRoot;
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        } else {
            return root;
        }

        updateHeight(root);
        int balance = balanceFactor(root);

        if (balance > 1 && value < root.left.value) {
            return rotateRight(root);
        }
        if (balance < -1 && value > root.right.value) {
            return rotateLeft(root);
        }
        if (balance > 1 && value > root.left.value) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        if (balance < -1 && value < root.right.value) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
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
        Node root = null;
        int[] values = {10, 20, 30, 40, 50, 25};
        for (int value : values) {
            root = insert(root, value);
        }

        System.out.print("AVL inorder: ");
        inorder(root);
        System.out.println();
        System.out.println("Root: " + root.value + ", height: " + height(root));
    }
}
