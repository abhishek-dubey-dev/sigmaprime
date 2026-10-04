package binary_tree;

public class SubtreeOfAnotherTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static boolean isSameTree(Node first, Node second) {
        if (first == null || second == null) {
            return first == second;
        }

        return first.value == second.value
                && isSameTree(first.left, second.left)
                && isSameTree(first.right, second.right);
    }

    static boolean isSubtree(Node root, Node candidate) {
        if (candidate == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        return isSameTree(root, candidate)
                || isSubtree(root.left, candidate)
                || isSubtree(root.right, candidate);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node candidate = new Node(2);
        candidate.left = new Node(4);
        candidate.right = new Node(5);

        System.out.println("Is subtree: " + isSubtree(root, candidate));
    }
}
