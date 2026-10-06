package bst;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static void printPaths(Node root, List<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.value);
        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else {
            printPaths(root.left, path);
            printPaths(root.right, path);
        }
        path.remove(path.size() - 1);
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

        System.out.println("Root-to-leaf paths:");
        printPaths(root, new ArrayList<>());
    }
}
