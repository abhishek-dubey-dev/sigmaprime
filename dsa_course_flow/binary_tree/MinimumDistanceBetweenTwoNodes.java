package binary_tree;

public class MinimumDistanceBetweenTwoNodes {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node lowestCommonAncestor(Node root, int first, int second) {
        if (root == null || root.value == first || root.value == second) {
            return root;
        }

        Node left = lowestCommonAncestor(root.left, first, second);
        Node right = lowestCommonAncestor(root.right, first, second);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    static int distanceFrom(Node root, int target, int distance) {
        if (root == null) {
            return -1;
        }
        if (root.value == target) {
            return distance;
        }

        int leftDistance = distanceFrom(root.left, target, distance + 1);
        if (leftDistance != -1) {
            return leftDistance;
        }
        return distanceFrom(root.right, target, distance + 1);
    }

    static int minimumDistance(Node root, int first, int second) {
        Node ancestor = lowestCommonAncestor(root, first, second);
        if (ancestor == null) {
            return -1;
        }

        int firstDistance = distanceFrom(ancestor, first, 0);
        int secondDistance = distanceFrom(ancestor, second, 0);
        if (firstDistance == -1 || secondDistance == -1) {
            return -1;
        }
        return firstDistance + secondDistance;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println("Minimum distance: " + minimumDistance(root, 4, 6));
    }
}
