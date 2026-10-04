package binary_tree;

public class SumOfNodes {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.value + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println("Sum of nodes: " + sum(root));
    }
}
