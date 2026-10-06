package bst;

import java.util.ArrayList;
import java.util.List;

public class ConvertBSTToBalancedBST {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static void storeInorder(Node root, List<Integer> values) {
        if (root == null) {
            return;
        }
        storeInorder(root.left, values);
        values.add(root.value);
        storeInorder(root.right, values);
    }

    static Node buildBalanced(List<Integer> values, int start, int end) {
        if (start > end) {
            return null;
        }

        int middle = start + (end - start) / 2;
        Node root = new Node(values.get(middle));
        root.left = buildBalanced(values, start, middle - 1);
        root.right = buildBalanced(values, middle + 1, end);
        return root;
    }

    static Node convert(Node root) {
        List<Integer> values = new ArrayList<>();
        storeInorder(root, values);
        return buildBalanced(values, 0, values.size() - 1);
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
        Node root = new Node(10);
        root.right = new Node(20);
        root.right.right = new Node(30);
        root.right.right.right = new Node(40);
        root.right.right.right.right = new Node(50);

        Node balancedRoot = convert(root);
        System.out.print("Balanced BST inorder: ");
        inorder(balancedRoot);
        System.out.println();
    }
}
