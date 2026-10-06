package bst;

public class ValidateBST {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean isValidBST(Node root, long minimum, long maximum) {
        if (root == null) {
            return true;
        }
        if (root.value <= minimum || root.value >= maximum) {
            return false;
        }
        return isValidBST(root.left, minimum, root.value)
                && isValidBST(root.right, root.value, maximum);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        System.out.println("Is valid BST: " + isValidBST(root));
        root.left.right.value = 12;
        System.out.println("After invalid change: " + isValidBST(root));
    }
}
