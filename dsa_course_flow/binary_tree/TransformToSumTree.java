package binary_tree;

public class TransformToSumTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int originalValue = root.value;
        int leftSum = transform(root.left);
        int rightSum = transform(root.right);
        root.value = leftSum + rightSum;
        return originalValue + root.value;
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        transform(root);
        System.out.print("Sum tree preorder: ");
        preorder(root);
    }
}
