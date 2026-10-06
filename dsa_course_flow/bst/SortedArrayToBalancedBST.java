package bst;

public class SortedArrayToBalancedBST {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node buildBalanced(int[] sortedValues, int start, int end) {
        if (start > end) {
            return null;
        }

        int middle = start + (end - start) / 2;
        Node root = new Node(sortedValues[middle]);
        root.left = buildBalanced(sortedValues, start, middle - 1);
        root.right = buildBalanced(sortedValues, middle + 1, end);
        return root;
    }

    static Node buildBalanced(int[] sortedValues) {
        if (sortedValues == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }
        for (int i = 1; i < sortedValues.length; i++) {
            if (sortedValues[i - 1] >= sortedValues[i]) {
                throw new IllegalArgumentException("Input array must be strictly increasing");
            }
        }
        return buildBalanced(sortedValues, 0, sortedValues.length - 1);
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
        int[] values = {3, 5, 6, 8, 10, 11, 14};
        Node root = buildBalanced(values);
        System.out.print("Balanced BST inorder: ");
        inorder(root);
        System.out.println();
    }
}
