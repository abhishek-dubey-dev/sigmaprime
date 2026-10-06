package bst;

public class MirrorBST {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node originalLeft = root.left;
        root.left = mirror(root.right);
        root.right = mirror(originalLeft);
        return root;
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
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        mirror(root);
        System.out.print("Mirrored tree preorder: ");
        preorder(root);
        System.out.println();
    }
}
