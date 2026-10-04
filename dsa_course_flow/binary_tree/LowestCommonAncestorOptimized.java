package binary_tree;

public class LowestCommonAncestorOptimized {
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

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node ancestor = lowestCommonAncestor(root, 4, 5);
        System.out.println("Lowest common ancestor: " + (ancestor == null ? -1 : ancestor.value));
    }
}
