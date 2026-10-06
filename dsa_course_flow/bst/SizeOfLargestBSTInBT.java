package bst;

public class SizeOfLargestBSTInBT {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static class Info {
        final boolean isBst;
        final int subtreeSize;
        final int largestBstSize;
        final long minimum;
        final long maximum;

        Info(boolean isBst, int subtreeSize, int largestBstSize, long minimum, long maximum) {
            this.isBst = isBst;
            this.subtreeSize = subtreeSize;
            this.largestBstSize = largestBstSize;
            this.minimum = minimum;
            this.maximum = maximum;
        }
    }

    static Info largestBstInfo(Node root) {
        if (root == null) {
            return new Info(true, 0, 0, Long.MAX_VALUE, Long.MIN_VALUE);
        }

        Info left = largestBstInfo(root.left);
        Info right = largestBstInfo(root.right);
        int subtreeSize = left.subtreeSize + right.subtreeSize + 1;

        if (left.isBst && right.isBst
                && left.maximum < root.value && root.value < right.minimum) {
            long minimum = Math.min(root.value, left.minimum);
            long maximum = Math.max(root.value, right.maximum);
            return new Info(true, subtreeSize, subtreeSize, minimum, maximum);
        }

        return new Info(false, subtreeSize,
                Math.max(left.largestBstSize, right.largestBstSize),
                Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static int largestBstSize(Node root) {
        return largestBstInfo(root).largestBstSize;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        System.out.println("Largest BST size: " + largestBstSize(root));
    }
}
