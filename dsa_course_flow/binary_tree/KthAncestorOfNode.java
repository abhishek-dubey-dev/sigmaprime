package binary_tree;

public class KthAncestorOfNode {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static int kthAncestor(Node root, int target, int k) {
        if (k < 1) {
            return -1;
        }
        int[] ancestor = {-1};
        findKthAncestor(root, target, k, ancestor);
        return ancestor[0];
    }

    static int findKthAncestor(Node root, int target, int k, int[] ancestor) {
        if (root == null) {
            return -1;
        }
        if (root.value == target) {
            return 0;
        }

        int leftDistance = findKthAncestor(root.left, target, k, ancestor);
        int rightDistance = findKthAncestor(root.right, target, k, ancestor);
        int distanceFromTarget = Math.max(leftDistance, rightDistance);
        if (distanceFromTarget == -1) {
            return -1;
        }
        if (distanceFromTarget + 1 == k) {
            ancestor[0] = root.value;
        }
        return distanceFromTarget + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int ancestor = kthAncestor(root, 4, 2);
        if (ancestor == -1) {
            System.out.println("Kth ancestor does not exist.");
        } else {
            System.out.println("Kth ancestor: " + ancestor);
        }
    }
}
